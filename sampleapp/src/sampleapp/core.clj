(ns sampleapp.core
  (:use [ring.adapter.jetty]
        [ring.middleware.reload])
  (:require [compojure.handler :as handler])
  ;; app config
  (:require [sampleapp.routes])
  ;; app handlers
  (:require [sampleapp.controllers.user]
            [sampleapp.controllers.task]
            [sampleapp.views.layout]
            [sampleapp.views.task]
            [sampleapp.views.user])
  
  )

(def webapp
  (handler/site sampleapp.routes/all-routes))

(defonce server
  (run-jetty (wrap-reload webapp '(sampleapp.core)) {:port 8080 :join? false}))
