(ns clojuresamples.sumofprimes.sumprimes)

(defn get-remainder [n d]
  (let [val  (rem n d)]
    ;(println n "by" d "rem" val)
    val
    )
  )

;(time (checkprime-v2 100003 ) ) ;12.5831 msecs
(defn checkprime-v2 "if n is not divisible by any other numbers less than n/2 faster way" [n]
  ;(not (contains? (set (map #(rem n %) (range 2 n) )) 0) )
  (not (contains? (set (map #(get-remainder n %) (range 2 (quot n 2)) )) 0) )
  )

;(time (checkprime-v2 100003 ) ) ;27.0322 msecs
(defn checkprime "if n is not divisible by any other numbers less than n" [n]
  ;(not (contains? (set (map #(rem n %) (range 2 n) )) 0) )
  (not (contains? (set (map #(get-remainder n %) (range 2 n) )) 0) )
  )

(defn isprime [n]
  (if (and (some? n) (> n 1) (checkprime-v2 n) ) true false)
  )

(defn generate-primes [n]
  (remove nil? (map #(when (isprime %) %) (range 2 n)) )
 )


(defn generate-primes-in-range [n m]
  (remove nil? (map #(when (isprime %) %) (range n m)) )
  )

(defn sumprimes [n]
  (reduce + (generate-primes n))
  )

(defn sumprimes-in-range [n m]
  (reduce + (generate-primes-in-range n m))
  )