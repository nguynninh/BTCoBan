package weed1;

import java.util.Scanner;

public class Ex17InRaSoNgay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int y = input.nextInt();
        switch (m) {
            case 1:
                System.out.println("31");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            case 2:
                if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
                    System.out.println("29");
                    break;
                } else {
                    System.out.println("28");
                    break;
                }
            default:
                System.out.println("INVALID");
                break;
        }
    }
}
