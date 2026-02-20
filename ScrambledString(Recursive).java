class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1.compareTo(s2) == 0) return true; // if both string are exactly same
        if (s1.length() <= 1) return false;            //if string length is 1 and they are not equal 

        int n = s1.length();
        boolean flag = false;

        // Character frequency check (important pruning)
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int f : freq) {
            if (f != 0) return false;
        }

        

        // 5Try all partitions
        for (int i = 1; i < n; i++) {

            //  Case 1: No Swap
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                isScramble(s1.substring(i), s2.substring(i))) {
                return true;
            }

            //  Case 2: With Swap
            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
                isScramble(s1.substring(i), s2.substring(0, n - i))) {
                return true;
            }
        }

        return false;
    }

}
