package weed1;

import java.util.Scanner;

public class Ex18KiemtraChuInThuong {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if ((int) ch >= 97 && (int) ch <=122) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
