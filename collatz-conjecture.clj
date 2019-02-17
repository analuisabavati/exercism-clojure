(ns exercises.collatz-conjecture)

(defn collatz [n]
  (loop [steps 0 new-n n]
    (cond
      (>= 0 new-n)
      (throw (IllegalArgumentException.))
     
      (= 1 new-n) 
      steps
     
      (even? new-n) 
      (recur (inc steps) (/ new-n 2))
      
      :else
      (recur (inc steps) (+ (* 3 new-n) 1)))))
