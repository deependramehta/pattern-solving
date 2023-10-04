import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char) (65 + n - i + j) + "");
            }
            System.out.println();
        }

    }
}
