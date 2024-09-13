//24.09.02
package beakJoon.bronze.bronze3;

import java.util.Scanner;

public class MoneyHunter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int totalPrize = 0;

            if (one > 0 && one <= 21) {
                totalPrize += getFirstFestivalPrize(one);
            }

            if (two > 0 && two <= 31) {
                totalPrize += getSecondFestivalPrize(two);
            }

            System.out.println(totalPrize);
        }

        scanner.close();
    }

    public static int getFirstFestivalPrize(int rank) {
        if (rank == 1) return 5000000;
        if (rank <= 3) return 3000000;
        if (rank <= 6) return 2000000;
        if (rank <= 10) return 500000;
        if (rank <= 15) return 300000;
        if (rank <= 21) return 100000;
        return 0;
    }

    public static int getSecondFestivalPrize(int rank) {
        if (rank == 1) return 5120000;
        if (rank <= 3) return 2560000;
        if (rank <= 7) return 1280000;
        if (rank <= 15) return 640000;
        if (rank <= 31) return 320000;
        return 0;
    }
}