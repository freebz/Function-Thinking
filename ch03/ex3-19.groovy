// Example 3-19. List traversal using (sometimes hidden) indexes

def numbers = [6, 28, 4, 9, 12, 4, 8, 8, 11, 45, 99, 2]

def iterateList(listOfNums) {
  listOfNums.each { n ->
    println "${n}"
  }
}
println "Iterate List"
iterateList(numbers)
