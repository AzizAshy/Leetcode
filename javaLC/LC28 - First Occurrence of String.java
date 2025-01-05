
/**
 * Author <Aziz Ashy> aziz.ashy@gmail.com
 * 
 * Time : > 3.5%
 * Space : > 98%
 * Tests : 100%
 * 
 */

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && i+needle.length() <= haystack.length()) {
                boolean consistent = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (i+j < haystack.length() && haystack.charAt(i+j) != needle.charAt(j)) {
                        consistent = false;
                    }
                }
                if (consistent == true) {
                        return i;
                    }
            }
        }
        return -1;
    }
}