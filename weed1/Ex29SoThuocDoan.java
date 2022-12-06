package weed1;

import java.util.Scanner;

public class Ex29SoThuocDoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        double value2 = input.nextDouble();
        if (value!=(int) value){
            value++;
        }
        for (int i = (int) value; i <= (int) value2; i++) {
            System.out.print(i+" ");
        }
    }
}
