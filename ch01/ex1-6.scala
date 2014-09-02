// Returning a lazy list of matches
def indexOfAny(input : String, searchChars : Seq[Char]) : Seq[Int] = {
  def indexedInput = (0 until input.length).zip(input)
  for (pair <- indexedInput;
    char <- searchChars;
    if (char == pair._2)) yield (pair._1)
}
