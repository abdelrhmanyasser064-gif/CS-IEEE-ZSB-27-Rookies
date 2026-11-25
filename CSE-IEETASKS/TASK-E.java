import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String target = "codeforces";

        for (int i = 0; i < t; i++) {
            String c = s.next();
            if (target.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}