public static String cleanUpNames(listOfNames) {
  listOfNames
  .findAll { it.length() > 1 }
  .collect { it.capitalize() }
  .join ','
}
