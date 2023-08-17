class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int i = 0;
        
        for(int number : numbers){
            numbers[i]= number*2;
            i++;
        }
        answer = numbers.clone();
        
        return answer;
    }
}