class Solution {
    boolean solution(String s) {
        int count = 0;
        boolean answer = true;
        for(char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') {
                count++;
            } else if( c == 'y' || c == 'Y') {
                count--;
            }
        }
        return count == 0;
    }
}