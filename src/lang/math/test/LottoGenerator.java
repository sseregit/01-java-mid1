package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {

    public static void main(String[] args) {
        int[] numbers = new int[6];

        boolean[] booleans = new boolean[46];
        booleans[0] = true;

        Random random = new Random();

        int idx = 0;

        while(numbers[5] == 0) {
            int number = random.nextInt(45) + 1;

            if (!booleans[number]) {
                numbers[idx++] = number;
                booleans[number] = true;
            }
        }

        System.out.println("로또 번호: " + Arrays.toString(numbers));
    }
}
