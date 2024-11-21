package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        System.out.println(String.valueOf(num));
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(obj));

        String s = "" + num;
        System.out.println(s);

        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);
    }
}
