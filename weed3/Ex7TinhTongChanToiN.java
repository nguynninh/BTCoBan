package weed3;

import java.util.Scanner;

public class Ex7TinhTongChanToiN {
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumToM(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumToN(n));
        System.out.println(sumToM(n));
    }
}
