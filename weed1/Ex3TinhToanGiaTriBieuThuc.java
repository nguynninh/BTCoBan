import java.util.Scanner;

public class Ex3TinhToanGiaTriBieuThuc {
    public static int Equation2(int a, int b, int c) {
        return a * (b + c) + b * (a + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        System.out.println(Equation2(a, b, c));
    }
}
