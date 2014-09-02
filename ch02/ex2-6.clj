(defn process [list-of-emps]
  (reduce str (interpose ","
                         (map s/capitalize (filter #(< 1 (count %)) list-of-emps)))))
