import java.util.*;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int a = 1;
            for (int x = 1; x <= i; x++) {
                System.out.print(a + " ");
                a = a * (i - x) / x;
            }
            System.out.println();
        }

    }
}