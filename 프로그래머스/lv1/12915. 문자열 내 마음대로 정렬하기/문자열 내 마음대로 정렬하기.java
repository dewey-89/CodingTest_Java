import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));


        stringList.sort((a, b) -> {
            char charA = a.charAt(n);   // n번째 단어 추출
            char charB = b.charAt(n);   // n번째 단어 추출
            if (charA == charB) {       // n번째가 같으면 일반 오름차순 정렬
                return a.compareTo(b);
            }
            return Character.compare(charA, charB);
        });
        return stringList.toArray(new String[strings.length]);
    }
}