import java.util.ArrayList;
class Solution {
    public int solution(int left, int right) {
       int answer = 0;
        for(int i=left; i<=right; i++){
           if(getDivisorCnt(i)%2==0){
               answer+=i;
           }else{
               answer-=i;
           }
        }
        return answer;

    }


    // 소수 판별
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    // 소인수분해 해서 소수를 제외한 지수들만 ArrayList에 넣어서 리턴
    static ArrayList<Integer> getExponents(int num) {
        ArrayList<Integer> exponents = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                int exponent = 0;
                while (num % i == 0) {
                    num /= i;
                    exponent++;
                }
                if (exponent > 0) {
                    exponents.add(exponent);
                }
            }
        }
        return exponents;
    }

    //지수로 구한 약수의 개수
    static int getDivisorCnt(int num){
        ArrayList<Integer> exponents = new ArrayList<>();
        exponents = getExponents(num);
        int sum = 1;

        for (Integer e : exponents) {
            sum *= (e + 1);
        }
        return sum;
    }
}