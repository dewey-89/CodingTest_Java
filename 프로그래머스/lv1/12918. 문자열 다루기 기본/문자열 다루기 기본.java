class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            for(char x : s.toCharArray()){
               if(x>=65){
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        
        return answer;
    }
}