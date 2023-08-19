class Solution {
    public int solution(int num) {
        int answer = -1;
        long longNum = num;

        for(int i=0; i<500; i++){
            if(longNum%2==0){
                longNum/=2;
            }else{
                if(longNum==1){
                    answer = i;
                    break;
                }else{
                    longNum = (longNum*3)+1;
                }
            }
        }
        return answer;
    }
}