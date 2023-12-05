import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int a = 0;
        for(int num : arr){
            for(int i=0; i<num; i++){
                answer[a]=num;
                a++;
            }
        }
        return answer;
    }
}