// Example 3-20. List traversal using recursion

def recurseList(listOfNums) {
  if (listOfNums.size == 0) return;
  println "${listOfNums.head()}"
  recurseList(listOfNums.tail())
}
println "\nRecurse List"
recurseList(numbers)
