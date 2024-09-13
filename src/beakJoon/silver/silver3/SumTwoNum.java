//24.09.12 - 3273번
package beakJoon.silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SumTwoNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(num);

        int a = Integer.parseInt(br.readLine());
        int left = 0;
        int right = n - 1;
        while (left < right){
            int sum = num[left] + num[right];

            if (sum == a){
                count++;
                left++;
                right--;
            } else if (sum < a) {
                left++;
            }else {
                right--;
            }
        }
        System.out.println(count);
    }
}
