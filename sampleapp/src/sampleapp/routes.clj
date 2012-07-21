(ns sampleapp.routes
  (:require [compojure.route :as route]
            [sampleapp.views.layout])
  (:use [compojure.core]
        [clojure-webmvc.core]))

;; test with
;; curl http://esumitra:3000/user/index
;; curl -X PUT -d "a=b" http://esumitra:3000/user/create
;; curl http://esumitra:3000/user/view/3
;; curl -data "a=b&c=d" http://esumitra:3000/user/update
;; curl -X DELETE http://esumitra:3000/user/delete/7
(defroutes app-user-routes
  (rest-routes [:user] :project-name "sampleapp"))

;; tasks use a layout function to specify a layout
;; tasks are also rendered using enlive view famework
(defroutes app-task-routes
  (rest-routes [:task] :project-name "sampleapp" :layout sampleapp.views.layout/sampleapp-layout))

(defroutes default-routes
  (GET "/" [] "This is the root modified again and again")
  (route/files "/" {:root "public"})
  (route/not-found "page not found :("))

(defroutes all-routes
  app-user-routes
  app-task-routes
  default-routes
  )
