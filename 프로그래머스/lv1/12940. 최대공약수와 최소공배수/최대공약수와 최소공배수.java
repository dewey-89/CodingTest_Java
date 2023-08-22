class Solution {
    public int[] solution(int n, int m) {   
        int gcd = 0;
        if(n>m){
            gcd = gcd(n,m);
        }else{
            gcd = gcd(m,n);
        }
        int lcd = n*m/gcd;
        int[] answer = {gcd, lcd};
        return answer;
    }
    
    int gcd(int n, int m){
        int x = 0;
        while(m>0){
                x = n%m;
                n = m;
                m = x;
        }
        return n;
    }
}