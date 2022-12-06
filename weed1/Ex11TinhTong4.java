public class Ex11TinhTong4 {
    public static long printsumToN(long n){
        long sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=2*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(printsumToN(1000000));
        System.out.println(printsumToN(3));
    }
}
