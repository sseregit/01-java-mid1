package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog 멍멍일 = new Dog("멍멍일", 2);
        Dog 멍멍이 = new Dog("멍멍이", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(멍멍일.toString());
        System.out.println(멍멍이.toString());
        System.out.println();
        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(멍멍일);
        System.out.println(멍멍이);
        System.out.println();
        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(멍멍일);
        ObjectPrinter.print(멍멍이);

        int i = System.identityHashCode(멍멍일);
        System.out.println("i = " + i);
        String refValue = Integer.toHexString(i);
        System.out.println("refValue = " + refValue);

    }
}
