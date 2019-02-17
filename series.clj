(ns exercises.series)

(defn slices [string-of-digits length]
  (if (<= length 0)
    [""]
    (->> string-of-digits
         (partition length 1)
         (map clojure.string/join)))))
