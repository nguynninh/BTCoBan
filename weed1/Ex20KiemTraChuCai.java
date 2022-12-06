package weed1;

import java.util.Scanner;

public class Ex20KiemTraChuCai {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
