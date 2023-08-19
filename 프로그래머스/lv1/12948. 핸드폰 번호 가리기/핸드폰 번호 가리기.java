class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String blindNum = "";
        String endNum = phone_number.substring(length-4,length-1)+phone_number.charAt(length-1);
        for(int i = 0; i<length-4; i++){
            blindNum+='*';
        }
        answer = String.join("",blindNum,endNum);

        return answer;
    }
}