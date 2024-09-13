//24.09.08 - 17387번
package beakJoon.bronze.bronze2;
import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int bonus = 0;
        int totalScore = 0;

        count = scanner.nextInt();
        scanner.nextLine();

        String a = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if(a.charAt(i) == 'O'){
                totalScore += (i+1) + bonus;
                bonus++;
            }

            if (a.charAt(i) == 'X')
                bonus = 0;

        }
        System.out.println(totalScore);
    }
}
