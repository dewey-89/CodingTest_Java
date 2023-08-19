import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length==1){return answer=new int[]{-1};}
        int min = Integer.MAX_VALUE;
        for(int a : arr){
            if(min>a){
                min = a;
            }
        }
        
        int index = 0;
        for(int a : arr){
            if(a!=min){
                answer[index] = a;
                index++;
            }
        }
        return answer;
    }
}