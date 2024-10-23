class Solution {
    public int[] solution(long n) {
        String changeN = String.valueOf(n);
        int[] answer = new int[changeN.length()];
        
        int idx = changeN.length() -1;
        for (char c : changeN.toCharArray()) {
            answer[idx] = c -'0';
            idx--;
        } 
        return answer;
    }
}