public class Ex16KiemTraNamNhuan {
    public static String printYear(int year) {
        if( year<=0){
            return "INVALID";
        }else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(printYear(2021));
        System.out.println(printYear(2020));
        System.out.println(printYear(-1982));
    }
}
