// Example 3-24. Java 8 version of the company process

public String cleanNames(List<String> names) {
    if (names == null) return "";
    return names
	.stream()
	.map(e -> capitalize(e))
	.filter(n -> n.length() > 1)
	.collect(Collectors.joining(","));
}
