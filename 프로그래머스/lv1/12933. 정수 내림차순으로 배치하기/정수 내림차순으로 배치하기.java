import java.util.List;
import java.util.ArrayList;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<Long> temp = new ArrayList<>();
        while(n!=0){
            temp.add(n%10);
            n = n / 10;
        }
        temp.sort(Long::compareTo);
        int i=0;
        for(Long num : temp){
            answer+= (long) (num * Math.pow(10,i));
            i++;
        }
        return answer;
    }
}