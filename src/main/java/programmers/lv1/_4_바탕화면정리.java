package programmers.lv1;

public class _4_바탕화면정리 {
    public static void main(String[] args) {

    }

    public static class Solution{
        public int[] solution(String[] wallpaper) {
            int minx = 51;
            int miny = 51;
            int maxx = 0;
            int maxy = 0;

            for (int i = 0; i < wallpaper.length; i++) {
                for (int j = 0; j < wallpaper[i].length(); j++) {
                    if (wallpaper[i].charAt(j) == '#'){
                        if (i < miny) {
                            miny = i;
                        }
                        if (i > maxy) {
                            maxy = i;
                        }
                        if (j < minx) {
                            minx = j;
                        }
                        if (j > maxx) {
                            maxx = j;
                        }
                    }
                }
            }
            int[] answer = new int[]{miny, minx, maxy+1, maxx+1};
            return answer;
        }
    }
}

// 최소(y,x)와 최대(y,x)
// wallpaper[i].charAt(j)

//           i j
// .#...  -> 0,1  miny=0, minx=1, maxx=1
// ..#..  -> 1,3  maxy=1, maxx=3
// ...#.  -> 2,4  maxy=2


// ..
// #. -> 1,0  miny=1 minx=0, maxy=1+1 maxx=0+1