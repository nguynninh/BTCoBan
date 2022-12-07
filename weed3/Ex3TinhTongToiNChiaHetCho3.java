package weed3;

import java.util.Scanner;

public class Ex3TinhTongToiNChiaHetCho3 {

    public static int sumToNChiaHetCho3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i * i;
            }
        }
        return sum;
    }

    public static int sumToMChiaHetCho3(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0) {
                sum += i * i;
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumToNChiaHetCho3(n));
        System.out.println(sumToMChiaHetCho3(n));
    }
}


