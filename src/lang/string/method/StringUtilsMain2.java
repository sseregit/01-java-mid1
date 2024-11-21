package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        String format = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format);

        String format1 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format1);

        System.out.printf("숫자: %.2f\n", 10.1234);

        String regex = "Hello, (Java!|World)";
        System.out.println(str.matches(regex));
    }
}
