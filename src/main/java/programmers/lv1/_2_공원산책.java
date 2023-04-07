package programmers.lv1;

public class _2_공원산책 {
    public static void main(String[] args) {
        String[] park = new String[]{"SOO", "OOO", "OOO"};
        String[] routes = new String[]{"E 2","S 2","W 1"};
        Solution s = new Solution();
        int[] solution = s.solution(park, routes);
        System.out.printf("%d, %d", solution[0], solution[1]);
    }

    static class Solution{
        public int[] solution(String[] park, String[] routes) {
            int width = park[0].length();
            int height = park.length;
            int[] now = new int[2];

            StartPoint:
            for (int j=0; j<park.length; j++) {
                for (int i = 0; i < park[j].length(); i++) {
                    if (park[j].charAt(i) == 'S') {
                        now[0]=j;
                        now[1] = i;
                        break StartPoint;
                    }
                }
            }

            Loop1:
            for (int i = 0; i < routes.length; i++) {
                char op = routes[i].charAt(0);
                int n = Integer.parseInt(routes[i].split(" ")[1]);

                switch (op) {
                    case 'N':
                        if(now[0]-n >= 0){
                            for (int j=now[0]-1; j>=(now[0]-n); j--){
                                if(park[j].charAt(now[1])=='X'){
                                    continue Loop1;
                                }
                                if (j == (now[0] - n)) {
                                    now[0] = now[0]-n;
//                                    System.out.printf("route%d: %d, %d\n",i, now[0], now[1]);
                                    break;

                                }
                            }
                        }
                        break;
                    case 'S':
                        if(now[0]+n < height){
                            for(int j=now[0]+1; j<=now[0]+n; j++){
                                if(park[j].charAt(now[1]) == 'X'){
                                    continue Loop1;
                                }
                                if (j == now[0] + n) {
                                    now[0] = now[0] + n;
//                                    System.out.printf("route%d: %d, %d\n",i, now[0], now[1]);
                                    break ;
                                }
                            }
                        }
                        break;
                    case 'E':
                        if (now[1] + n < width) {
                            for (int j = now[1] + 1; j <= now[1] + n; j++) {
                                if (park[now[0]].charAt(j) == 'X') {
                                    continue Loop1;
                                }
                                if (j == now[1] + n) {
                                    now[1] = now[1] + n;
//                                    System.out.printf("route%d: %d, %d\n",i, now[0], now[1]);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (now[1] - n >= 0) {
                            for (int j = now[1] - 1; j >= now[1] - n; j--) {
                                if (park[now[0]].charAt(j) == 'X') {
                                    continue Loop1;
                                }
                                if (j == now[1] - n) {
                                    now[1] = now[1] - n;
//                                    System.out.printf("route%d: %d, %d\n",i, now[0], now[1]);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }

            return now;
        }
    }
}
