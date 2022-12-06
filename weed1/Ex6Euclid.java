public class Ex6Euclid {
    public static double euclid(int x1, int y1, int x2, int y2) {
        return (double) Math.round(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) * 100) /100;
    }

    public static void main(String[] args) {
        System.out.println(euclid(1, 4, 4, 8));
    }
}
