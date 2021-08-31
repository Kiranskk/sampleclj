(ns clojuresamples.happynum.happynum
  (:import [java.lang.Character]
           [java.time LocalDate LocalDateTime]
           (java.text SimpleDateFormat)
           (java.util HashMap)
           (java.util Collection)
           )
  )

(defn get-chars []
  ;(map #(Character/getNumericValue %) (str 123456))
  ;(Character/getNumericValue 1)
  (Integer/parseInt "12112")
)

(defn get-today-date []
  (.toString (LocalDate/now))
 )

(defn get-format-date []
  (.toString (.parse (new SimpleDateFormat "yyyy-MM-dd") "10-10-2021" ))
  )

(defn get-time []
  (let [d (LocalDateTime/now) ]
    (.toString  d)
    )
  )

(defn my-map []
  (doto
    (new HashMap)
    (.put "hello" "test")
    (.put "world" "test2")
    )
  )

;TODO how to use java collections contains
(defn find-element []
  )



;steps
;take digits , do square each num
; sum squares
;repeat until it gets 1

(defn num-square [n]
(reduce * (repeat 2 n)))

(defn sum-of-squares [m n]
  (+ (num-square m) (num-square n) )
  ;(apply num-square (conj [] m n))
  ;reduce
)

(defn digits [n]
 (if (> n 9) (conj [] (quot n 10) (rem n 10)) [n] )
 )

(defn split-nums [n]
  (if (> n 99) (map digits (digits n)) (digits n))
)

;(recur (reduce-split-nums (first vals) (last vals)) )

(defn reduce-split-nums [n accum]
  (println "reduce-split" n "accum" accum)
  (loop [vals (digits n)
         res (concat [] accum)
         ]
  (println "vals" vals "res" res)
  (if (= 2 (count vals)) (recur (first vals) (last vals)) res)
  )
 )

(defn reduce-split-nums-v2 [n]
  (println "reduce-split" n)
  (loop [vals (digits n)
         res (list)
         ]
    (println "vals" vals "res" res)
    (if (= 2 (count vals)) (recur (digits (first vals)) (conj res (last vals)) ) (conj res (first vals)) )
    )
  )

(defn sum-of-squares-all [n]
  (reduce + (map #(num-square %) (reduce-split-nums-v2 n)))
  )


(defn happy-sum [n]
  (println "happy-sum" n)
  (let [nums (split-nums n)]
    (println "split-nums" nums)
    (sum-of-squares (first nums) (second nums) )
    )
 )

;(happy-sum n)
(defn reduce-happy-sum [n]
  (loop [val (sum-of-squares-all n)]
    (if (< val 9) val (recur (reduce-happy-sum val)))
  )
)

(defn is-happy-num-seq [n]
 (let [val (reduce-happy-sum n)
       ]
   (if (= 1 val) true false )
   )
)

