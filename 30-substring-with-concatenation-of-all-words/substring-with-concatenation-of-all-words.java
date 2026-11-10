class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int count = 0;

            HashMap<String, Integer> current = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (!map.containsKey(word)) {
                    current.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                while (current.get(word) > map.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);

                    current.put(leftWord, current.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }

                if (count == totalWords) {
                    ans.add(left);

                    String leftWord = s.substring(left, left + wordLen);
                    current.put(leftWord, current.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}