class Solution {
    public long solution(int price, int money, int count) {
        // count만큼 반복
        // n번째 이용시 price 증가, money 감소
        long answer = -1;
        long haveMoney = money;
        long newPrice = price;
        for(int i = 1; i <= count; i++){
            // money 감소
            haveMoney -= newPrice;
            //price 증가
            newPrice += price;
        }
        
        // haveMoney 가 0보다 크면 0 return
        // 그게 아니라면 haveMoney * -1 값을 return
        if(haveMoney > 0) answer = 0;
        else  answer = haveMoney * -1;
        
        return answer;
    }
}