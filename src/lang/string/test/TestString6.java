package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int index = 0;
        int count = 0;

        while (str.indexOf(key, index) > 0) {
            count++;
            index = str.indexOf(key, index) + 1;
        }

        System.out.println("count = " + count);

    }
}
