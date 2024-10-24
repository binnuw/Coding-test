import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String nStr = n + "";
        char[] nArr = nStr.toCharArray();
        Arrays.sort(nArr);
        String result = "";
        for(int i = nArr.length-1; i >= 0; i--){
            result += nArr[i];
        }
        
        return answer = Long.parseLong(result);
    }
}