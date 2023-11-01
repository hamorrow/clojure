(ns clojure.examples.example
   (:gen-class))
(defn Example []
   (def names (ref []))
   
   (defn change [newname]
      (dosync
         (alter names conj newname)))
   (change "John")
   (change "Mark")
   (println @names))
(Example)