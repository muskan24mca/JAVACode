package Arrays;
 import java.util.HashMap;

public class uniqueLetter {
        public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        uniqueLetter solution = new uniqueLetter();
        String input = "leetcode";
        String input2 = "loveleetcode";

        int firstUniqueIndex = solution.firstUniqChar(input);
        int firstUniqueIndex2 = solution.firstUniqChar(input2);

        System.out.println(firstUniqueIndex);
        
        System.out.println(firstUniqueIndex2);
    }
}

