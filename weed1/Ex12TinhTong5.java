public class Ex12TinhTong5 {
    public static long printsumToN(long n){
        long sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=Math.pow((-1),i)*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(printsumToN(100000000));
    }
}
