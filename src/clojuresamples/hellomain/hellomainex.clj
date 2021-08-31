(ns clojuresamples.hellomain.hellomainex)

(def my-map {:a "test" :b "hello"})

(defn- main [& args]
  (println "hello" my-map)
  )
