(ns sampleapp.controllers.task
  )

(defn index []
  "[controller = sampleapp.controllers.task/index]")

(defn view [id]
  (str "[controller = sampleapp.controllers.task/view, id=" id "]"))

(defn create [params]
  (str "[controller = sampleapp.controllers.task/create, params=" params "]"))

(defn update [id params]
  (str "[controller = sampleapp.controllers.task/update, id=" id ",params=" params "]"))

(defn delete [id]
  (str "[controller = sampleapp.controllers.task/delete, id=" id "]"))
