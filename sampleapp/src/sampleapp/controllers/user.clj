(ns sampleapp.controllers.user
  )

(defn index []
  "[controller = sampleapp.controllers.user/index]")

(defn view [id]
  (str "[controller = sampleapp.controllers.user/view, id=" id "]"))

(defn create [params]
  (str "[controller = sampleapp.controllers.user/create, params=" params "]"))

(defn update [id params]
  (str "[controller = sampleapp.controllers.user/update, id=" id ",params=" params "]"))

(defn delete [id]
  (str "[controller = sampleapp.controllers.user/delete, id=" id "]"))
