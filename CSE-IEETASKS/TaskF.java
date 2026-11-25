package tasks;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.printf("%02d\n", n % 100);
    }
}