package weed3;

import java.util.Scanner;

public class Ex11TinhXMuY {
    public static int hamMu(int x,int y) {
        int sum = 1;
        for (int i = 1; i <= y; i++) {
            sum *= x;
        }
        return sum;
    }

    public static int hamMu2(int x,int y) {
        int sum = 1;
        int i = 1;
        while (i <= y) {
            sum *= x;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(hamMu(x,y));
        System.out.println(hamMu2(x,y));
        System.out.println((int) Math.pow(x,y));
    }
}
