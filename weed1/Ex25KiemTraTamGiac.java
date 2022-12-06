package weed1;

import java.util.Scanner;

public class Ex25KiemTraTamGiac {
    public static boolean isTriangle(double a,double b,double c){
        return a<0||b<0||c<0||a*a+b*b<c*c||a*a+c*c<b*b||b*b+c*c<a*a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (!isTriangle(a,b,c)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
