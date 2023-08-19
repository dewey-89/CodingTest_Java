import java.util.*;
class Solution {
   public int[] solution(int[] arr, int divisor) {
        List<Integer> arrTest = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                arrTest.add(arr[i]);
            }
        }
        if(arrTest.size()==0){
            arrTest.add(-1);
        }
        int[] answer = new int[arrTest.size()];
        for(int i=0; i<arrTest.size(); i++){
            answer[i] = arrTest.get(i);
        }

        return answer;
    }
}