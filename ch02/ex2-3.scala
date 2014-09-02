val employees = List("neal", "s", "stu", "j", "rich", "bob", "aiden", "j", "ethan",
  "liam", "mason", "noah", "lucas", "jacob", "jayden", "jack")

val result = empployees
  .filter(_.length() > 1)
  .map(_.capitalize)
  .reduce(_ + "," + _)
