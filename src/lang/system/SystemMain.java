package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        System.out.println(System.getenv());

        System.out.println(System.getProperties());

        System.out.println(System.getProperty("java.version"));

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        System.exit(0);
    }
}
