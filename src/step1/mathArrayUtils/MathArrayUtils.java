package step1.mathArrayUtils;

public class MathArrayUtils {

    public static int sum(int[] array){
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static double average(int[] array){
        return (double)sum(array) / array.length;
    }


    public static int min(int[] array){
        int minNumber = max(array);
        for (int i : array) {
            if (minNumber > i){
                minNumber = i;
            }
        }
        return minNumber;
    }
    public static int max(int[] array){
        int maxNumber = 0;
        for (int i : array) {
            if (maxNumber < i){
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}
