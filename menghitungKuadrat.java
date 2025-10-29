import java.util.Scanner;

public class menghitungKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.print("input n : ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            jumlah = 0;
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
            }
            System.out.print("n = " + i + " --> jumlah kuadrat = ");
            for (int k = 1; k <= i; k++) {
                System.out.print(k * k);
                if (k < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }

    }
}
