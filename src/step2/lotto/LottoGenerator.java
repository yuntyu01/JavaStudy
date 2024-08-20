package step2.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers = new int[6];
    private int count;

    public LottoGenerator(){
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(45 + 1);
        }
    }

    public void showNumber(){
        System.out.println(Arrays.toString(lottoNumbers));
    }


}

