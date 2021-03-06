(ns enchilada.util.page
  (:require
    [clojure.string :as str]
    [hiccup.core :refer [html]]
    [hiccup.util :refer [to-uri]]))

(defn include-async-js [& scripts]
  (for [script scripts]
    [:script {:type "text/javascript" :src (to-uri script) :async true}]))

