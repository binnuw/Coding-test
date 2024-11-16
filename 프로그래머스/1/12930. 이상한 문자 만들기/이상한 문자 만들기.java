import java.util.*;

class Solution {
    public String solution(String s) {
        
        // 문자열 조합이니까 StringBuilder 사용
        StringBuilder answer = new StringBuilder();
        
        // 현재 조회중인 단어의 인덱스 번호
        int idx = 0;
        
        // s 문자열의 모든 문자 탐색
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            // 만약 공백이면 공백 추가하고 idx 초기화
            if (str.equals(" ")) {
                answer.append(str);
                idx = 0;
                continue;
            }
            
            // 공백이 아니면 idx가 짝수인지 홀수인지에 따라 맞는 값 넣기
            if (idx % 2 == 0)   answer.append(str.toUpperCase());
            else                answer.append(str.toLowerCase());
            
            idx++;
        }
     
        return answer.toString();
    }
}