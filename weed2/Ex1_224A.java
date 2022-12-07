package weed2;

import java.util.Scanner;

public class Ex1_224A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s1 = in.nextInt();
        double s2 = in.nextInt();
        double s3 = in.nextInt();
        double c = s3 * s2 / 2 * s1;
        double a = s3 / c;
        double b = s2 / c;
        System.out.println(a + b + c);
    }
}
