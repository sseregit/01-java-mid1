package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder add = valueAdder.add(1);
        ValueAdder add1 = add.add(2);
        ValueAdder add2 = add1.add(3);

        int result = add2.getValue();
        System.out.println("result = " + result);

        System.out.println("valueAdder = " + valueAdder);
        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);
        System.out.println("add2 = " + add2);

    }
}
