public class Ex10TinhTong3 {
    public static double SumN(int n) {
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += ((double) 1 / (i * (i + 1)));
        }
        return (double) Math.round(sum*100)/100;
    }

    public static void main(String[] args) {
        System.out.println(SumN(99));
    }
}
