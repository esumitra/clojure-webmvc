(ns sampleapp.views.layout
  (:use [net.cgrand.enlive-html :as html])
  )

(html/deftemplate sampleapp-layout
  (html/html-resource "views/layout.html")
  [content-nodes]
  [:div#content] (html/content content-nodes))  

