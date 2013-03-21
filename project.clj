(defproject programming-enchiladas "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://programming-enchiladas.destructuring-bind.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1586"]
                 [org.clojure/data.json "0.2.1"]
                 [clj-http "0.6.5"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.2"]
                 [jayq "2.3.0"]
                 [rm-hull/monet "0.1.6-SNAPSHOT"]
                 [rm-hull/turtle "0.1.0-SNAPSHOT"]] 
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler enchilada.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}}
  :min-lein-version "2.1.0"
  :warn-on-reflection true)