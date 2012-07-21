(ns sampleapp.views.task
  (:use [net.cgrand.enlive-html :as html])
  )

(html/defsnippet index
  (html/html-resource "views/task.html")
  [:div#common]
  [msg]
  [:div.controller] (html/content msg)
  [:div.view] (html/content "[view=sampleapp.views.task/index]"))

(html/defsnippet view
  (html/html-resource "views/task.html")
  [:div#common]
  [msg]
  [:div.controller] (html/content msg)
  [:div.view] (html/content "[view=sampleapp.views.task/view]"))

(html/defsnippet create
  (html/html-resource "views/task.html")
  [:div#common]
  [msg]
  [:div.controller] (html/content msg)
  [:div.view] (html/content "[view=sampleapp.views.task/create]"))

(html/defsnippet update
  (html/html-resource "views/task.html")
  [:div#common]
  [msg]
  [:div.controller] (html/content msg)
  [:div.view] (html/content "[view=sampleapp.views.task/update]"))


(html/defsnippet delete
  (html/html-resource "views/task.html")
  [:div#common]
  [msg]
  [:div.controller] (html/content msg)
  [:div.view] (html/content "[view=sampleapp.views.task/delete]"))
