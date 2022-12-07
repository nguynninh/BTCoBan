package weed3;

import java.util.Scanner;

public class Ex4SumToi1PhanN {
    public static double sumTo1PhanN(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (double) i;
        }
        return Math.round(sum * 100) / 100.0;
    }

    public static double sumTo1PhanM(int n) {
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 1 /(double) i;
            i++;
        }
        return Math.round(sum * 100) / 100.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumTo1PhanN(n));
        System.out.println(sumTo1PhanM(n));
    }
}
