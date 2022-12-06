package weed1;

import java.util.Scanner;

public class Ex21KiemTraChuSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
