//24.09.01
package beakJoon.bronze.bronze4;

import java.util.*;

public class diceThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int prizeMoney = 0;
        int sameNumber = 0;
        List<Integer> dice = new ArrayList<>();
        List<Integer> diceNumber = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            dice.add(scanner.nextInt());
        }

        for (Integer number : dice) {
            if (!diceNumber.contains(number)) {
                diceNumber.add(number);
                continue;
            }
            sameNumber = number;
            count++;
        }

        if (count == 3)
            prizeMoney = 10000 + (sameNumber * 1000);

        if (count == 2)
            prizeMoney = 1000 + (sameNumber * 100);

        if (count == 1)
            prizeMoney = Collections.max(dice) * 100;


        System.out.println(prizeMoney);

    }
}
