class Kata {
    static String noSpace(final String x) {
        StringBuilder result = new StringBuilder();
        
        for (String word : x.split(" ")) {
          result.append(word);
        }
        return result.toString();
    }
}