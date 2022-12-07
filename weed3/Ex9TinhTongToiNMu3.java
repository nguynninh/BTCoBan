package weed3;

import java.util.Scanner;

public class Ex9TinhTongToiNMu3 {
    public static int sumToNMu3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i*i;
        }
        return sum;
    }

    public static int sumToMMu3(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i*i*i;
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(sumToNMu3(n));
        System.out.println(sumToMMu3(n));
    }
}
