package weed1;

import java.util.Scanner;

public class Ex26KiemTraTamGiac {
    public static boolean isTriangle(double a, double b, double c) {
        return a < 0 || b < 0 || c < 0 || a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a;
    }

    public static boolean isIsoscelesTriangle(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return a == b || b == c || a == c;
        } else {
            return false;
        }
    }

    public static boolean isEquilateralTriangle(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return a == b && b == c;
        } else {
            return false;
        }
    }

    public static boolean isRightTriangle(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (isIsoscelesTriangle(a, b, c)) {
            System.out.print(1);
        } else if (isEquilateralTriangle(a, b, c)) {
            System.out.print(2);
        } else if (isRightTriangle(a, b, c)) {
            System.out.print(3);
        } else if (!isTriangle(a, b, c)) {
            System.out.print(4);
        } else {
            System.out.print("INVALID");
        }

    }
}
