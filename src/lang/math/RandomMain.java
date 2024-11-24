package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("random.nextInt() = " + random.nextInt());

        System.out.println("random.nextDouble() = " + random.nextDouble());

        System.out.println("random.nextBoolean() = " + random.nextBoolean());

        System.out.println("random.nextInt(10) = " + random.nextInt(10));

        System.out.println("random.nextInt(10)+1 = " + (random.nextInt(10) + 1));
    }
}
