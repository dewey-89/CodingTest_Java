class Solution {
  public String solution(String s) {
        String answer = "";
        if(s.length()==1) return s;
        float index = (float) s.length()/2;
        if(s.length()%2!=0){
            answer += s.charAt((int)index);
        }else{
            answer = s.substring((int)index-1,(int)index+1);
        }
        return answer;
    }
}