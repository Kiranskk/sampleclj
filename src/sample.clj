(ns sample
  (:require [clojure.string :as str])
  )

(defn hello [] (print "hello world"))

(defn sum-of-num [n]
  (reduce + (range n))
  )

(defn sum-of-n-num [n]
 (when-not (nil? n)  (/ (* n (+ 1 n)) 2))
  )

(defn flip-str [s]
  (str/reverse s)
  )