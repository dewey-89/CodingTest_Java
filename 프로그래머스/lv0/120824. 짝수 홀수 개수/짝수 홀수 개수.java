class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int cnt = 0;
        
        for(int i=0; i<num_list.length; i++){   
            double temp = (double)num_list[i];
            if(temp%2!=0){
                cnt +=1;
            }
        }
        answer[1]=cnt;
        answer[0]=num_list.length-cnt;
        
        return answer;
    }
}