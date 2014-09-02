val cities = Map("Atlanta" -> "GA", "New York" -> "New York",
  "Chicago" -> "IL", "San Francisco" -> "CA", "Dallas" -> "TX")

cities map { case (k, v) => println(k + " -> " + v) }
