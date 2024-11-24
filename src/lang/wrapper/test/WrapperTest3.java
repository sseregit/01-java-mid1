package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer i = Integer.valueOf(str);
        System.out.println("Integer.valueOf(str) = " + i);
        int i2 = i.intValue();
        System.out.println("i2 = " + i2);
        System.out.println("Integer.valueOf(i2) = " + Integer.valueOf(i2));

    }
}
