package weed1;

import java.util.Scanner;

public class Ex31KetQuaHocTap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hsa1 = input.nextDouble();
        double hsb1 = input.nextDouble();
        double hs2 = input.nextDouble();
        double hs3 = input.nextDouble();
        double tongket = (hsa1 + hsb1 + hs2 * 2 + hs3 * 3) / 7;
        tongket = Math.round(tongket * 100) / 100.0;
        if (tongket >= 8) {
            System.out.println(tongket + " - Gioi");
        } else if (tongket >= 6.5 && tongket < 8) {
            System.out.println(tongket + " - Kha");
        } else if (tongket >= 5 && tongket < 6.5) {
            System.out.println(tongket + " - TB");
        } else {
            System.out.println(tongket + " - Yeu");
        }
    }
}
