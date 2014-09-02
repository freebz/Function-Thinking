public String cleanNamesP(List<String> names) {
    if (names == null) return "";
    return names
	.parallelStream()
	.filter(n -> n.length() > 1)
	.map(e -> capitalize(e))
	.collect(Collectors.joining(","));
}
