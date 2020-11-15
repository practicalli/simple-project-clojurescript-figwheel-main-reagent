# ClojureScript, figwheel-main and reagent simple demo

Project created with the [figwheel-main](https://github.com/bhauman/figwheel-main-template) template using Clojure CLI tools

```
clojure -X:project/new :template figwheel-main :name practicalli/simple-demo -- -reagent
```


## Development
Run an interactive development environment:

    clojure -M:fig:build

The command compiles the ClojureScript code into JavaScript and send that code to the JavaScript engine in the default browser, providing a Browser connected REPL for the ClojureScript project.

Changes to the ClojureScript source code are automatically compiled and sent to browser REPL without the need to reload.

Evaluate a call to `js/alert` as simple check that the browser repl is responding to changes

    (js/alert "Am I connected?")

An alert box should popup in the browser window.


Clean the project by removing all the compiled files:

    rm -rf target/public

Create a production build run:

    rm -rf target/public
    clojure -M:fig:min


The `figwheel-main.edn` file can contain different build configurations, defined in their own build configurations, e.g. `dev.cljs.edn`, `test.cljs.edn`.

## License
Copyright © 2018 Practicalli

Distributed under the Creative Commons Attribution Share-Alike 4.0 International
