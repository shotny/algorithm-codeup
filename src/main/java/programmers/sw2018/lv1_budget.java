package programmers.sw2018;

public class lv1_budget {
    public static void main(String[] args) {

    }

    public static class Solution{
        public int solution(int[] d, int budget) {
            int answer = 0;
            int sum = 0;
            int max = 0;
            int maxIndex = 0;
            int[] arr = new int[d.length];

            for(int i=0; i<d.length; i++){
                if(d[i]+sum<=budget){
                    arr[answer]=d[i];
                    if(d[i]>max){
                        maxIndex = answer;
                        max = d[i];
                    }
                    ++answer;
                    sum += d[i];
                } else if((sum - max + d[i]) <= budget){
                    sum = sum - max + d[i];
                    arr[maxIndex] = d[i];
                    max = 0;
                    for(int j=0; j<=answer; j++){
                        if(arr[j] > max){
                            max = arr[j];
                            maxIndex = j;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
