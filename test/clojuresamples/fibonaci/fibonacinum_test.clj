(ns clojuresamples.fibonaci.fibonacinum-test
  (:require [clojuresamples.fibonaci.fibonacinum :refer :all]
            [clojure.test :refer :all])
  )


(deftest is-fibonaci-num-test
   (testing "test if a number is fibonaci"
     (is (= true (is-fibonaci 13) ))
     (is (= false (is-fibonaci 10) ))
     (is (= true (is-fibonaci 55) ))
     (is (= false (is-fibonaci 35) ))
     (is (= true (is-fibonaci 5702887) ))
     ))

