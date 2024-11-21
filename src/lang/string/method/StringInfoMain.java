package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String str = "Hello, Java!";

        int length = str.length();
        System.out.println("length = " + length);
        boolean empty = str.isEmpty();
        System.out.println("empty = " + empty);
        boolean blank = str.isBlank();
        System.out.println("blank = " + blank);
        System.out.println("            = " +"           ".isBlank());

        char c = str.charAt(7);
        System.out.println("7 index " + c);
    }
}
