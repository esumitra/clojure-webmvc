# Clojure-webmvc
The Model-View-Controller or MVC pattern is used extensively in web applications to separate the different concerns of each web application layer in accordance with SOLID design principles. However the MVC pattern alone is not sufficient to manage the application complexity as the functionality of the web application grows. As the functionality grows, the need for cleanly structured components in web application also grows in importance. Most real web applications use conventions to structure the code. These conventions for structuring the code can take the form of package structure in java, file names in ruby/rails. 

Frameworks like ruby-on-rails, spring-mvc, spring-roo impose a code structure convention unique to each framework. Clojure-webmvc provides a convention for structuring a RESTful MVC based web application similar to rails and spring-roo.

The sample application illustrates the use of clojure-webmvc in a webapplication
## Installation
To include in a clojure project add org.clojars.ed_sumitra/clojure-webmvc to the project dependencies

    [org.clojars.ed_sumitra/clojure-webmvc "1.0.0-SNAPSHOT"]
 

## Convention used
clojure-webmvc assumes application resources will be accessed using REST. The convention used for MVC web applications is
* All controllers are in the namespace **project.controllers.resource**
* All views are in the namespace **project.views.resource**

A request to **GET /user/index** will invoke the **myproject.controllers.user/index** controller function and apply its results to the **myproject.views.user/index** view function
This results in the following code structure that helps managing the complexity of larger web applications.

    myproject
      src
          controllers
            resource1
            resource2
            ...
          views
            resource1
            resource2
            ...

There is no restriction on which view frameworks can be used. clojure-webmvc can work with enlive or hiccup HTML generation frameworks.
## Basic Usage
After using/requiring the clojure-webmvc package in the namespace define the restful routes for a resource using the compojure defroutes macro

    (defroutes user-routes
      (rest-routes [:user]))

This will create the following compojure routes

    (GET "/user/index" [] (contoller-handler-fn))


## Configuration

## Mixing routes

## License
Source Copyright © 2009-2012 Edward Sumitra

clojure-webmvc is distributed under EPL 1.0 (see file epl-v10.html)
