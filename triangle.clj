(ns exercises.triangle)

(defn  triangle-type [x y z]
  (let [[a b c] (sort [x y z])]
    (cond
      (= a b c)            :equilateral
      (<= (+ a b) c)       :illogical
      (or (= a b) (= b c)) :isosceles
      :else                :scalene)))
