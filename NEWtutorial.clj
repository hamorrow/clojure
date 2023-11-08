(def immutable-list '(1 2 3))
(def immutable-vector [1 2 3])
(def immutable-map {:a 1 :b 2 :c 3})
(def immutable-set #{1 2 3})

(def new-vector (conj immutable-vector 4))
(def new-list (conj immutable-list 0))
(def new-map (assoc immutable-map :d 4))
(def new-set (conj immutable-set 4))

(def without-element (disj immutable-set 3))
(def updated-map (assoc immutable-map :a 42))

(defn add-element [coll elem]
  (conj coll elem))

(let [x 1]
  (println x))

(defn add-one-to-all [seq]
  (map inc seq))

(def original-vector [1 2 3])
(def new-vector (conj original-vector 4))

(def more-vector (conj new-vector 5))
(def more-list (conj new-list -1))
(def more-map (assoc updated-map :e 5))
(def more-set (conj new-set 5))

(def less-vector (pop more-vector))
(def less-list (rest more-list))
(def less-map (dissoc more-map :e))
(def less-set (disj more-set 5))

(defn multiply-by-two [seq]
  (map #(* 2 %) seq))

(def multiplied-list (multiply-by-two immutable-list))
(def multiplied-vector (multiply-by-two immutable-vector))

(defn invert-map [m]
  (into {} (map (fn [[k v]] [v k]) m)))

(def inverted-map (invert-map immutable-map))

(def nested-vector [immutable-vector new-vector more-vector less-vector])
(def nested-map {:original immutable-map
                 :updated updated-map
                 :more more-map
                 :less less-map})

(def sum-vector (reduce + immutable-vector))
(def product-list (reduce * immutable-list))

(defn exponentiate [x n]
  (reduce (fn [acc _] (*' acc x)) 1 (repeat n)))

(def power (exponentiate 2 8))

(def range-vec (vec (range 1 10)))
(def even-nums (filter even? range-vec))

(def pairs (partition 2 range-vec))

(def zipped (map vector immutable-vector immutable-list))

(def interleave-seq (interleave immutable-vector immutable-list))

(def flat-nested-vector (flatten nested-vector))