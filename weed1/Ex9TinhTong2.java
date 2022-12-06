public class Ex9TinhTong2 {
    public static long SumToN2(int n){
        long sum=0;
        for (int i = 1; i <= n ; i++) {
            sum+=(i*i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumToN2(10000));
    }
}
