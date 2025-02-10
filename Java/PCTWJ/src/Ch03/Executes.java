package Ch03;

import java.util.Arrays;

public class Executes {
    public static void main(String[] args) {
//        Sol_301 sol301 = new Sol_301();
//        int[][] sol301_val1 = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
//        int[][] sol301_val2 = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
//        int[][] sol301_val3 = {{1, -1, 0}, {2, -1, 0}};
//        int[][] sol301_val4 = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
//        System.out.println(Arrays.toString(sol301.solution(sol301_val1)));
//        System.out.println(Arrays.toString(sol301.solution(sol301_val2)));
//        System.out.println(Arrays.toString(sol301.solution(sol301_val3)));
//        System.out.println(Arrays.toString(sol301.solution(sol301_val4)));

//        Sol_302 sol302 = new Sol_302();
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Arrays.toString(sol302.solution(i + 4)));
//        }

        Sol_303 sol303 = new Sol_303();
        String[][] sol303_val = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(Arrays.toString(sol303.solution(sol303_val)));
    }
}
