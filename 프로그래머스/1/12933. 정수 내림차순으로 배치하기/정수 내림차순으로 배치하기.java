import java.util.*;
class Solution {
    public long solution(long n) {
        char[] nArr = String.valueOf(n).toCharArray();
        Arrays.sort(nArr);
        
        StringBuilder result = new StringBuilder();
        for(int i = nArr.length-1; i >= 0; i--) {
            result.append(nArr[i]);
        }
        
        return Long.parseLong(result.toString());
    }
}