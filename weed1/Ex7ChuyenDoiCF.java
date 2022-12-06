public class Ex7ChuyenDoiCF {
    public static double CF(int c){
        return Math.round(((c*9/5)+32)*100)/100;
    }

    public static void main(String[] args) {
        System.out.println(CF(24));
    }
}
