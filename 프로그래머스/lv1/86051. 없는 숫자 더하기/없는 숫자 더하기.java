import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = (9*(9+1)/2)-Arrays.stream(numbers).sum();
        return answer;
    }
}