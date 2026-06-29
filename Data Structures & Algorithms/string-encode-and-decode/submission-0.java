class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for (String str: strs) {
            string.append(str.length()).
            append("#").append(str);
        }

        return string.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int beginIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                int lengthOfWord = Integer.parseInt(str.substring(beginIndex, i));
                result.add(str.substring(i + 1, i + lengthOfWord + 1));

                beginIndex = i + lengthOfWord + 1;
                i += lengthOfWord + 1;
            }
        }

        return result;
    }
}
