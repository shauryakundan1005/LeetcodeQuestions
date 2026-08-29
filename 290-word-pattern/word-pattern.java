class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = arr[i];

            // Check character -> word
            if (map1.containsKey(ch) && !map1.get(ch).equals(word)) {
                return false;
            }

            // Check word -> character
            if (map2.containsKey(word) && map2.get(word) != ch) {
                return false;
            }

            map1.put(ch, word);
            map2.put(word, ch);
        }

        return true;
    }
}