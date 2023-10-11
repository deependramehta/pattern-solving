import java.util.*;

public class leapyear {
    public static int leapYear(int n) {
        if (n % 100 == 0 && n % 400 == 0 || n % 100 != 0 && n % 4 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        leapYear(n);
    }

}
