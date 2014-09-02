(defn process2 [list-of-emps]
  (->> list-of-emps
       (filter #(< 1 (count %)))
       (map s/capitalize)
       (interpose ",")
       (reduce str)))
