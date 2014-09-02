static def sumFactors(number) {
  factors(number).inject(0, {i, j -> j + j})
}