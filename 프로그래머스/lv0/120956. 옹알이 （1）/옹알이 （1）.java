class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] check = {"aya", "ye", "woo", "ma"};

        for(String babblingChar : babbling){
            for(String checkChar : check){
                babblingChar = babblingChar.replace(checkChar, "#");
            }
            if(babblingChar.replace("#","").equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}