class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = (long)price*(count * (count+1)/2);
        
        if(money >= totalPrice){
            answer = 0;
        }else{
            answer = totalPrice - money;
        }
        return answer;
    }
}