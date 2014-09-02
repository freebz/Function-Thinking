public int aliquotSum(List<Integer> factors) {
    return factors.foldLeft(fj.function.Integers.add, 0) - factors.last();
}
