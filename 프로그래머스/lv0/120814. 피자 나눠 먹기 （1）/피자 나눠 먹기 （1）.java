class Solution {
    public int solution(int n) {
        int answer = 0;
        double temp = (double)n;
        
        if(n%7!=0){
            if(7/n<0){
                answer = 1;
            }else{
                answer = n/7+1;
            }
        }else{
            answer = n/7;
        }
        return answer;
    }
}