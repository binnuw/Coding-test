import java.util.*;
class Solution {
    public int solution(String s) {
        String answer = "";
        String[] numString = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        HashMap<String,String> numList = new HashMap<>();
        for(int i =0; i <= 9; i++) {
            numList.put(numString[i],String.valueOf(i));
        }
        String newAnswer = "";
        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9') {
                answer += c;        
            } else {
                newAnswer += c;
                if(numList.containsKey(newAnswer)) {
                    answer += numList.get(newAnswer);
                    newAnswer = "";
                    continue;
                }
            }
        }
    
        
        return Integer.parseInt(answer);
    }
}