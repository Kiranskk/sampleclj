(ns sample-test
  (:require [sample :as src]))
(use 'clojure.test)

(deftest sum-of-n-num-test []
  (is (= 55 (src/sum-of-n-num 10)) "sum of n numbers test")
  (is (= 0 (src/sum-of-n-num 0)) "sum of zero numbers test")
  (is (= nil (src/sum-of-n-num nil)) "sum of numbers test for nil params"))
