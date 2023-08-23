import java.util.*;
class Solution {
    public int solution(String s) {
        
        Map<String,Integer> map1 = new HashMap<String, Integer>();
        map1.put("zero",0);
        map1.put("one",1);
        map1.put("two",2);
        map1.put("three",3);
        map1.put("four",4);
        map1.put("five",5);
        map1.put("six",6);
        map1.put("seven",7);
        map1.put("eight",8);
        map1.put("nine",9);

        for(String a : map1.keySet()){
            s = s.replaceAll(a, String.valueOf(map1.get(a)));
        }
        return Integer.parseInt(s);
    }
}