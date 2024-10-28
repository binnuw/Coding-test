import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        
        int idx = 0;
        for (int i : arr) {
            if (i % divisor == 0)
                answer[idx++] = i;
        }
        
        if (idx == 0) {
            return new int[] {-1};
}
        
        int[] result = new int[idx];
        for (int i = 0; i < idx; i++) {
            result[i] = answer[i];
        }
        
        Arrays.sort(result);
        return result;
    }
}