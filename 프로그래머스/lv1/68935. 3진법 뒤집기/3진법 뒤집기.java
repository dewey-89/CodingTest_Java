class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        while(n!=0){
            a += ""+ n%3;
            n = n/3;
        }
        for(int i=0; i<a.length(); i++){
            double pow = Math.pow(3,a.length()-i-1);
            answer += (int)pow*Integer.parseInt(""+a.charAt(i));
        }
        return answer;
    }
}