public class Ex14ChiaHetNhoNhat {
    public static int printNumber(int a, int b) {
        int number =0;
        while ( a >0) {
            if (a % b == 0) {
                number = a;
                break;
            }
            a++;
        }
        return number;

    }

    public static void main(String[] args) {
        System.out.println(printNumber(19,5));
        System.out.println(printNumber(20,5));
        System.out.println(printNumber(21,5));
    }

}
