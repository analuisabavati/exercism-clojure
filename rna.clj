(ns exercises.rna)

(def dna->rna {\G \C
               \C \G
               \T \A
               \A \U})

(defn to-rna
  [dna]
  (apply str (map (fn [x]
                    (assert (contains? dna->rna x))
                    (get dna->rna x))
                  dna)))
