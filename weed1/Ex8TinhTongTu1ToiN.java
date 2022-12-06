public class Ex8TinhTongTu1ToiN {
    public static long SumToN(int n){
        long sum=0;
        for (int i = 1; i <= n ; i++) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumToN(1000000000));
    }
}
