class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char temp = 'a';
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                temp = entry.getKey();
                count++;
                break;
            }
        }
        if (count == 0) {
            return -1;
        }
        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == temp) {
                return index;
            }
            index++;
        }

        return -1;

    }
}