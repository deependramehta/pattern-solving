import java.util.*;

class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n;
        for (int i = 0; i <= 2*n-2; i++) {
            for (int j = 0; j <= 2*n-2; j++) {
                int index = N - Math.min(Math.min(i, j), Math.min(2*n-2 - i, 2*n-2 - j));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
