(ns clojure-webmvc.core
  (:use [compojure.core]))

(defn html-view [view-name arg-list & options]
  "produces the html-view applying layout if specified"
  (let [{:keys [layout], :or {layout 'identity}} options]
    (cond
      (= 'identity layout) (apply str (apply view-name arg-list))
      :else (apply str (layout (apply view-name arg-list))))))

(defn convention-controller
  "connects controllers and views based on rails style conventions"
  [controller-name handler-name arglist & options]
  (let [{:keys [project-name format layout view],
         :or {project-name "myproject"
              format 'html
              layout 'identity
              }} options
                 cname (str project-name ".controllers." controller-name "/" handler-name)
                 cfn (resolve (symbol cname))
                 vname (if (nil? view) (str project-name ".views." controller-name "/" handler-name) view)
                 vfn (resolve (symbol vname))
                 vargs (let [cresult (apply cfn arglist)]
                         (cond
                           (nil? cresult) []
                           (vector? cresult) cresult
                           :else [cresult]))]
    (html-view vfn vargs :layout layout)))

(defn- rest-resource-handler
  "generates a compojure route for given resource and action"
  [app-opts resource action]
  (let [act (name action)
        res (name resource)
        project-name (:project-name app-opts)
        layout (:layout app-opts)]
  (cond
    (= act "index") (GET (str "/" res "/" act) [] (convention-controller res act [] :project-name project-name :layout layout))
    (= act "create") (PUT (str "/" res "/" act) [& params] (convention-controller res act [params] :project-name project-name :layout layout))
    (= act "view") (GET (str "/" res "/" act "/:id") [id] (convention-controller res act [id] :project-name project-name :layout layout))
    (= act "update") (POST (str "/" res "/" act "/:id") [id & params] (convention-controller res act [id params] :project-name project-name :layout layout))
    (= act "delete") (DELETE (str "/" res "/" act "/:id") [id] (convention-controller res act [id] :project-name project-name :layout layout))
    :else ())))

(defn rest-routes
  "generates compojure REST routes for specified resources"
  [resource-list & opts]
  (let [{:keys [project-name layout actions]
         :or {project-name "myproject"
              layout 'identity
              actions [:index :create :view :update :delete]}
         } opts]           
    (apply routes
           (flatten
            (map (fn [res]
                   (map (partial rest-resource-handler {:project-name project-name :layout layout} res) actions)) resource-list)))))
