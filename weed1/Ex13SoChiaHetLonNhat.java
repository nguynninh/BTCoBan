public class Ex13SoChiaHetLonNhat {
    public static int printNumber(int a, int b) {
        int number =0;
        for (int i = a; i > 0; --i) {
            if (i % b == 0) {
                number = i;
                break;
            }
        }
        return number;

    }

    public static void main(String[] args) {
        System.out.println(printNumber(19,5));
        System.out.println(printNumber(20,5));
    }

}
