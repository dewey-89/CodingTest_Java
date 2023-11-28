import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> finisher = new HashMap<>();
        for(String comp : completion){
            finisher.put(comp,finisher.getOrDefault(comp,0)+1);
        }
        
        for(String runner : participant){
            if(finisher.containsKey(runner)&&finisher.get(runner)!=0){
                finisher.put(runner,finisher.getOrDefault(runner,0)-1);
                continue;
            }else{
                answer = runner;
                break;
            }    
        }
        
        
        return answer;
    }
}