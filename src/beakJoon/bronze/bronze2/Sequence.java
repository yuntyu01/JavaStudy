//24.09.02
package beakJoon.bronze.bronze2;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int historyNum = 0;

        for (int i = 1; i <= a ; i++) {
            int b = scanner.nextInt();
            int c = b * i - historyNum;
            System.out.println(c);
            historyNum += c;
        }

    }

}
