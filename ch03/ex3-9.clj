(def subtract-from-hundred (partial - 100))

(subtract-from-hundred 10)	; same as (- 100 10)
; 90

(subtract-from-hundred 10 20)	; same as (- 100 10 20)
; 70
