

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();

        int r1 = -1, c1 = -1;
        int r2 = -1, c2 = -1;

        for (int i = 0; i < h; i++) {
            String row = s.next();
            for (int j = 0; j < w; j++) {
                if (row.charAt(j) == 'o') {
                    if (r1 == -1) {
                        r1 = i;
                        c1 = j;
                    } else {
                        r2 = i;
                        c2 = j;
                    }
                }
            }
        }

        int moves = Math.abs(r1 - r2) + Math.abs(c1 - c2);
        System.out.println(moves);
    }
}