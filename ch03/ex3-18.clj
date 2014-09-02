; Example 3-18. Using partial application to supply implicit values

(defn db-connect [data-source query params]
  ...)

(def dbc (partial db-connect "db/some-data-source"))

(dbc "select * from %1" "cust")
