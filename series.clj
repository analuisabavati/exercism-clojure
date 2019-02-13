(ns exercises.series)

(defn slices [string-of-digits length]
  (if (<= length 0)
    [""]
    (map clojure.string/join (partition length 1 string-of-digits))))
