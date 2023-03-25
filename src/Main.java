import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = scanner.nextInt();
        int i, j;
        for (i = 2; num > 0; i += 1) {
            int sq = (int) Math.sqrt(i);
            boolean prime = true;
            for (j = 2; j <= sq; ++j) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
                --num;
            }
        }
        System.out.println("\nTime = " + (System.currentTimeMillis() - startTime) / 1000 + " s");

    }
}
