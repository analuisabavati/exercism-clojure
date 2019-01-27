(ns exercises.rna)
         
(defn dna->rna [nucleotide]
  (case nucleotide
    \C \G
    \G \C
    \A \U
    \T \A
    (throw (AssertionError. "Invalid nucleotide"))))

(defn to-rna [dna]
  (->> dna 
       (map dna->rna) 
       (apply str)))
