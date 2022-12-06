package weed1;

import java.util.Scanner;

public class Ex27ChuyenDoiNgaySangThangNamNgay {
    public static String Convert(int day) {
        int year = day / 30 / 12;
        int month = (day - (year * 30 * 12)) / 30;
        int days = (day - (year * 30 * 12) - (month * 30));
        return year + " nam " + month + " thang " + days + " ngay";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Convert(input.nextInt()));
    }
}
