public class Ex5TinhChuViDienTichHinhTron {
    public static void PSTron(int r) {
        System.out.print((double) Math.round((2 * r * Math.PI) * 100) / 100);
        System.out.print(" ");
        System.out.print((double) Math.round((r * r * Math.PI) * 100) / 100);
    }

    public static void main(String[] args) {
        PSTron(10);
    }
}
