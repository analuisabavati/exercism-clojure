(ns exercises.phone-number)

(defn number
  [num-string]
  (let [num-cleaned (clojure.string/replace num-string #"\D" "")]
    (cond 
      (= (count num-cleaned) 10)
      num-cleaned
      
      (and (= (count num-cleaned) 11) (.startsWith num-cleaned "1"))
      (clojure.string/replace-first num-cleaned "1" "")
          
      :else
      "0000000000")))

(defn area-code
  [num-string]
  (subs (number num-string) 0 3))

(defn pretty-print
  [num-string]
  (str "(" (area-code num-string) ")"
       " "
       (subs (number num-string) 3 6)
       "-"
       (subs (number num-string) 6 10)))
