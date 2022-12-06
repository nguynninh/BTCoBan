public class Ex15KiemTraSoChiaHetCho3Va5 {
    public static int printN35(int n) {
        if (n % 3 == 0 && n % 5 == 0){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(printN35(30));
        System.out.println(printN35(25));
    }
}
