package weed1;

import java.util.Scanner;

public class Ex30PhepChia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a / b == c || b / c == a || c / a == b) {
            System.out.println("/");
        }else {
            System.out.println("NOSOL");
        }
    }
}
