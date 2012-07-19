# Clojure-webmvc
The Model-View-Controller or MVC pattern is used extensively in web applications to separate the different concerns of each web application layer in accordance with SOLID design principles. However the MVC pattern alone is not sufficient to manage the application complexity as the functionality of the web application grows. As the functionality grows, the need for cleanly structured components in web application also grows in importance. Most real web applications use conventions to structure the code. These conventions for structuring the code can take the form of package structure in java, file names in ruby/rails. 

Frameworks like ruby-on-rails, spring-mvc, spring-roo impose a code structure convention unique to each framework. Clojure-webmvc provides a convention for structuring a RESTful MVC based web application similar to rails and spring-roo.

## Installation
To include in a clojure project add org.clojars.ed_sumitra/clojure-webmvc to the project dependencies

    [org.clojars.ed_sumitra/clojure-webmvc "1.0.0-SNAPSHOT"]
 

## Convention used
clojure-webmvc assumes application resources will be accessed using REST. the convention used for MVC web applications is
* All controllers are in the namespace _project.controllers.resource_
* All views are in the namespace _project.views.resource_

A resouce `GET /user/index` will invoke the _myproject.controllers.user/index_ controller function and apply its results to the _myproject.views.user/index_ view function
This results in the following code structure that facilitates managing the complexity of larger web applications.

## Basic Usage

## Configuration

## Mixing routes

## License
Source Copyright © 2009-2012 Edward Sumitra

clojure-webmvc is distributed under EPL 1.0 (see file epl-v10.html)
