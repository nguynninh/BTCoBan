package weed1;

import java.util.Scanner;

public class Ex22ChuyenChuInHoaThanhInThuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            ch += 32;
        }
        System.out.println(ch);
    }
}
