class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int l= numbers.length;
        for(int i=0; i<l; i++){
            answer+=numbers[i];
        }
        answer = answer/l;
        return answer;
    }
}