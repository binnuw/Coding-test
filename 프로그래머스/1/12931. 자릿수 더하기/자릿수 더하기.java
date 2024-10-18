import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = "" + n;
        String[] nArr = nStr.split("");
        
        for (int i = 0; i <nStr.length(); i++) {
            answer += Integer.parseInt(nArr[i]);
        }

        return answer;
    }
}