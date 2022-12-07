package weed3;

import java.util.Scanner;

public class Ex6TinhTong1 {
    public static double sumToN(int n) {
        double sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = -sum + i;
        }
        return Math.round(sum * 100) / 100.0;
    }

    public static double sumToM(int n) {
        double sum = 1;
        int i = 2;
        while (i <= n) {
            sum = -sum + i;
            i++;
        }
        return Math.round(sum * 100) / 100.0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumToN(n));
        System.out.println(sumToM(n));
    }
}
