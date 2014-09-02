public static IntStream factorsOf(int number) {
    return range(1, number + 1)
	.filter(potenntial -> number % potential == 0);
}
