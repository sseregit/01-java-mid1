package nested.test;

public class OuterClass2 {

    class InnerClass {

        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}
