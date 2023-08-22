import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {

        int[] b ={0,0};
        for(int[] x : sizes){
            Arrays.sort(x);
            for(int i=0; i<x.length; i++){
                if(x[i]>=b[i]){
                    b[i]=x[i];
                }
            }
        }
        return b[0]*b[1];
    }
}