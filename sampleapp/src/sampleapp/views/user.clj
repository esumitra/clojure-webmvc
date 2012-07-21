(ns sampleapp.views.user
  )

(defn index [msg]
  (str msg "[view = sampleapp.views.user/index]"))

(defn view [msg]
  (str msg "[view = sampleapp.views.user/view]"))

(defn create [msg]
  (str msg "[view = sampleapp.views.user/create]"))

(defn update [msg]
  (str msg "[view = sampleapp.views.user/update]"))

(defn delete [msg]
  (str msg "[view = sampleapp.views.user/delete]"))
