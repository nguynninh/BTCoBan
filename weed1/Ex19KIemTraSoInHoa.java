package weed1;

import java.util.Scanner;

public class Ex19KIemTraSoInHoa {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if ((int) ch >= 64 && (int) ch <= 90 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
