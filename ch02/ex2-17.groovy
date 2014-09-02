static def factors(number) {
  def factors = (1..round(sqrt(number)+1)).findAll({number % it == 0))
  (factors + factors.collect {number / it}).unique()
}
