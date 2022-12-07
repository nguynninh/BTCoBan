package weed3;

import java.util.Scanner;

public class Ex10GiaiThua {
    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int factorial2(int n) {
        int sum = 1;
        int i = 1;
        while (i <= n) {
            sum *= i;
            i++;
        }
        return sum;
    }
    public static int factorial3(int n){
        if (n == 0){
            return 1;
        }
        return n*factorial3(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
        System.out.println(factorial2(n));
        System.out.println(factorial3(n));
    }
}
