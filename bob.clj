(ns exercises.bob)

(def whatever-phareses ["Tom-ay-to, tom-aaaah-to." 
                        "Let's go make out behind the gym!"
                        "It's OK if you don't want to go to the DMV."
                        "Ending with ? means a question."
                        "1, 2, 3"])

(def woah-phareses ["WATCH OUT!"
                   "WHAT THE HELL WERE YOU THINKING?"
                    "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!"
                    "1, 2, 3 GO!"
                    "I HATE YOU"])

(def sure-phareses ["Does this cryogenic chamber make me look fat?"
                   "4?"])

(defn response-for
  [phrase]
  (cond
    (some (partial = phrase) whatever-phareses)
    "Whatever."
    
    (some (partial = phrase) woah-phareses)
    "Woah, chill out!"
    
    (some (partial = phrase) sure-phareses)
    "Sure."
    
   	(clojure.string/blank? phrase)
    "Fine. Be that way!"))))
