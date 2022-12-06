public class Ex4TinhTongHieuTichThuong {
    public static void caculate(int a, int b) {
        System.out.print(a + b + " ");
        System.out.print(a - b + " ");
        System.out.print(a * b + " ");
        System.out.print((double) Math.round((a / b) * 100) / 100);
    }

    public static void main(String[] args) {
        caculate(10, 2);
        System.out.println();
        caculate(1000000, 1000000);
    }
}
