package weed1;

import java.util.Scanner;

public class Ex23ChuyenKyTuInThuongThanhInHoa {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char ch = input.next().charAt(0);
            if (ch >= 'a' && ch <= 'z'){
                ch -= 32;
            }
            System.out.println(ch);
        }
}
