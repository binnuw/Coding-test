class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if(length != 4 && length != 6) return answer = false;
        for(char c : s.toCharArray()) {
            if(c < '0' || c > '9') return answer = false;  
        }
        return answer;
    }
}