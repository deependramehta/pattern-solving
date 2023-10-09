import java.util.*;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, space, rows, star = 0;
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();

        for (i = 0; i < rows - 1; i++) {
            for (space = 1; space < rows - 1; space++) {
                System.out.print(" ");
            }
            for (star = 0; star <= 2 * i; star++) {
                if (star == 0 || star == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 0; i < 2 * rows - 1; i++) {
            System.out.print(" *");
        }
    }

}
