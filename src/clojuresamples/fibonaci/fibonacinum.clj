(ns clojuresamples.fibonaci.fibonacinum)

;fibonaci series
;0 1 1 2 3 5 8 13 21 34 55 89 144
;13/2 6 1
;6/2 3 0
;2^n-1
;2^5-1- 2*2*2*2*2-1 = 31

(defn gen-fibo-nums [n]
 (range (inc n))
 )

(defn fibo-seq [n]
  (loop [acc [0 1]
         res []
         ]
    ;(println "acc" acc)
    ;(println "res" res)
    (if (< (last acc) n) (recur (conj [] (last acc) (reduce + acc)) (conj res (first acc)) ) (into res acc))
    )
  )

(defn is-fibonaci [num]
  (if (some #(= num %) (fibo-seq num)) true false)
  )


