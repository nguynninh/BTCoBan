
package weed3;

import java.util.Scanner;

public class Ex2TinhTongTuToiN2 {
    public static int sumToN2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }

    public static int sumToM2(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i*i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumToN2(n));
        System.out.println(sumToM2(n));
    }
}

