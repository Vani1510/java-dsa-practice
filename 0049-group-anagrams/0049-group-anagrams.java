class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> groups = new HashMap<>();

    for (String word : strs) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        String sortedKey = new String(letters);

        if (!groups.containsKey(sortedKey)) {
            groups.put(sortedKey, new ArrayList<>());
        }
        groups.get(sortedKey).add(word);
    }

    return new ArrayList<>(groups.values());
}
}