class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String str: strs) {
            int[] pattern = new int[26];
            for (char ch: str.toCharArray()) {
                pattern[ch - 'a']++;
            }

            String key = Arrays.toString(pattern);

            result.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(result.values());
    }
}
