package weed3;

import java.util.Scanner;

public class Ex5TinhTongDen1Phan2N {
    public static double sumTo1Phan2N(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (double) (2*i);
        }
        return Math.round(sum * 100) / 100.0;
    }

    public static double sumTo1Phan2M(int n) {
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 1 /(double) (2*i);
            i++;
        }
        return Math.round(sum * 100) / 100.0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumTo1Phan2N(n));
        System.out.println(sumTo1Phan2M(n));
    }
}
