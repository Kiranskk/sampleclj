(ns clojuresamples.happynum.happynum-test
  (:require [clojure.test :refer :all]
            [clojuresamples.happynum.happynum :refer :all]
            ))

(deftest is-happy-num-test
  (testing "is a happy number sequqnce"

    (with-redefs [reduce-happy-sum (fn [n] 1)]
      (is (= true (is-happy-num-seq 31) ))
      )



    ))

