(ns exercises.leap-year)

(defn leap-year?
  [year]
  (cond 
    (-> year (mod 400) zero?) true
    (-> year (mod 100) zero?) false
    (-> year (mod 4) zero?) true
    :else false))
