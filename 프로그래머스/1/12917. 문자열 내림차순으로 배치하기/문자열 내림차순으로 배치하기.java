import java.util.*;
class Solution {
    public String solution(String s) {
        char[] nStr = s.toCharArray();
        Arrays.sort(nStr);
        
        StringBuilder answer = new StringBuilder();
        for(int idx = nStr.length-1; idx >= 0; idx--)
            answer.append(nStr[idx]);
        
        return answer.toString();
    }
}