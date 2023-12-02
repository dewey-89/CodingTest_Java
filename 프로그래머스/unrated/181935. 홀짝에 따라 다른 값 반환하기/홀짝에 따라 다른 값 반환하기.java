class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2!=0){
            int temp = 1;
            while(temp!=n+2){
                answer+=temp;
                temp+=2;
            }
        }else{
            int temp = 2;
            while(temp!=n+2){
                answer+=Math.pow(temp,2);
                temp+=2;
            }
        }
        return answer;
    }
}