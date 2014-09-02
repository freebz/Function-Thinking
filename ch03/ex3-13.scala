// Example 3-13.Differences between map and collect

List(1, 3, 5, "seven") map { case i: Int ? i + 1 } // won't work
// scala.MatchError: seven (of class java.lang.String)

List(1, 3, 5, "seven") collect { case i: Int ? i + 1 }
// verify
assert(List(2, 4, 6) == (List(1, 3, 5, "seven") collect { case i: Int ? i + 1 }))
