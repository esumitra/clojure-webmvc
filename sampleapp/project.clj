(defproject sampleapp "1.0.0-SNAPSHOT"
  :description "sample app illustrating use of webmvc"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring/ring-core "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.1"]
                 [compojure "1.0.4"]
                 [badjer/enlive "1.2.0-alpha1"]
                 [cheshire "4.0.1"]
                 [org.clojars.ed_sumitra/clojure-webmvc "1.0.0-SNAPSHOT"]
                 ]
  :dev-dependencies [
                     [lein-ring "0.7.1"]
                     [ring/ring-devel "1.1.1"]]
  :ring {:handler sampleapp.core/webapp})