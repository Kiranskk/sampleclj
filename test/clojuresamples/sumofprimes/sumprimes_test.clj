(ns clojuresamples.sumofprimes.sumprimes-test
  (:require
    [clojuresamples.sumofprimes.sumprimes :as src]
    [clojure.test :refer :all]
    )
  )

;TODO TDD Arrange Act Assert

(deftest sumprimes_test
 (testing "testing sum of primes"
   (is (= 21 (src/sumprimes 10)))
   (is (= 81 (src/sumprimes 20)))
   (is (= 277054 (src/sumprimes 2000)))
   (is (= 2 (src/sumprimes 3)))
   )
 )

(deftest isprime-test
  (testing "is prime"
    (is (= true (src/isprime 5)) )
    (is (= false (src/isprime 1)) )
    (is (= false (src/isprime 15)) )
    (is (= true (src/isprime 2)) )
    (is (= true (src/isprime 211)) )
    (is (= false (src/isprime 0)) )
    (is (= false (src/isprime nil)) )
    (is (= true (src/isprime 7499)) )
    ))

