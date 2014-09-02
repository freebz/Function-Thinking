static def factors(number) {
  (1..number).findAll { number % it == 0 }
}
