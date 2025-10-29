import java.util.Scanner;

public class persegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3) : ");
        int n = sc.nextInt();
        for (int i = 1; i <= (n - (n - 1)); i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
            for (int k = 1; k <= (n - 2); k++) {
                System.out.print(n + " ");
                for (int l = 1; l <= (n - 2); l++) {
                    System.out.print("  ");
                }
                System.out.println(n + " ");
            }
            for (int m = 1; m <= n; m++) {
                System.out.print(n + " ");
            }
        }

    }
}