class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            double d = (double)i;
            if(d%2==0){answer+=i;}
        }
        
        
        return answer;
    }
}