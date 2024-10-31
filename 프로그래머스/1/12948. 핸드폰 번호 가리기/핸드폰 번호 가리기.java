class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int idx = phone_number.length()-1;
        
        for(int i = 0; i <=idx-4; i++){
            answer += "*";
        }
        System.out.print(idx);
        return answer+phone_number.substring(idx-3);
    }
}