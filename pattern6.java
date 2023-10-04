import java.util.*;

class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalN = n;
        n = 2 * n - 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int index = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}