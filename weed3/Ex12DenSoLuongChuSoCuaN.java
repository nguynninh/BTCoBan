package weed3;

import java.util.Scanner;

public class Ex12DenSoLuongChuSoCuaN {
    public static int demChuSo(int n){
        int dem=0;
        while (n!=0){
            dem++;
            n/=10;
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(demChuSo(n));
    }
}
