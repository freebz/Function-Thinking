public class Words {
    private Set<String> NON_WORDS = new HashSet<String>() {{
	    add("the"); add("and"); add("of"); add("to"); add("a");
	    add("i"); add("it"); add("in"); add("or"); add("is");
	    add("d"); add("s"); add("as"); add("so"); add("but");
	    add("be"); }};

    private List<String> regexToList(String words, String regex) {
	List wordList = new ArrayList<>();
	Matcher m = Pattern.compile(regex).matcher(words);
	while (m.find())
	    wordList.add(m.group());
	return wordList;
    }

    public Map wordFreq(String words) {
	TreeMap<String, Integer> wordMap = new TreeMap<>();
	regexToList(words, "\\w+").stream()
	    .map(w -> w.toLowerCase())
	    .filter(w -> !NON_WORDS.contains(w))
	    .forEach(w -> wordMap.put(w, wordMap.getOrDefault(w, 0) + 1));
	return wordMap;
    }
}
