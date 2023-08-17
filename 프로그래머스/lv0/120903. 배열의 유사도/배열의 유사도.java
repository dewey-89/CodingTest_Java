import java.util.Objects;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (String d1 : s1) {
            for (String d2 : s2) {
                if (Objects.equals(d1, d2)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}