class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char x : s.toCharArray()){
            if(x != ' '){
                System.out.println((int)x);
                if(x>=97) {
                    x = (char) (((x - 97) + n) % 26 + 97);
                }else{
                    x = (char) (((x - 65) + n) % 26 + 65);
                }
            }
            answer +=x;
        }
        return answer;
    }
}