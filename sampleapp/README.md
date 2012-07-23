# clojure-webmvc sampleapp

Sample web application illustrating the use of clojure-webmvc package. The sample application uses enlive for HTML templating.

## Running the sample application
To run the sample application, get the dependencies, startup a slime session and run the ring jetty server as shown below

    lein deps
    lein repl
    user> (use 'sampleapp.core)

The application is now running at *http://localhost:8080*. To stop the server use

    user> (.stop server)


## Sample application usage



## License

Copyright (C) 2012 Edward Sumitra

Distributed under the Eclipse Public License.
