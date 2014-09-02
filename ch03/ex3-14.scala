// Example 3-14. Defining a partial function in Scala

val answerUnits = new PartialFunction[Int, Int] {
  def apply(d: Int) = 42 / d
  def isDefinedAt(d: Int) = d != 0
}

assert(answerUnits.isDefinedAt(42))
assert(! answerUnits.isDefinedAt(0))
assert(answerUnits(42) == 1)
//answerUnits(0)
//java.lang.ArithmeticException: / by zero
