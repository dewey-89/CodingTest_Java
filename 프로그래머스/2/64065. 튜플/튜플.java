import java.util.*;
class Solution {
    public int[] solution(String s) {
        //원소들을 쭉 나열해서 스트링 배열로 저장
        String[] a = s.replaceAll("[{}]", "").split(",");

        // 각 원소를 key로 원소의 빈도를 Value로 Map에 저장.
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String e : a){
            frequencyMap.put(e,frequencyMap.getOrDefault(e,0)+1);
        }

        // Map을 Value 기준으로 정렬
        List<Map.Entry<String,Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        // 정렬된 Map의 Key값들을 역순으로 배열에 저장
        int[] answer = new int[list.size()];
        int i = list.size()-1;
        for(Map.Entry<String,Integer> e : list){
            answer[i--] = Integer.parseInt(e.getKey());
        }

        return answer;
    }
}