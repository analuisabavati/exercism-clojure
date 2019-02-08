(ns gigasecond
  (:require [clj-time.core :as time]))

(defn plus-gigasecond
    [date]
    (time/plus date (time/seconds 1e9)))

(defn format-output
    [date] 
    [(time/year date) (time/month date) (time/day date)])

(defn gigasecond 
    [year month day]
    (-> (time/date-time year month day)
        plus-gigasecond
        format-output))
