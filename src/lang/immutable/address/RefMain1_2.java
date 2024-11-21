package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        Address 서울 = new Address("서울");
        Address 어디 = new Address("어디");

        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);

        어디.setValue("부산");
        System.out.println("어디 -> 부산");
        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);
    }
}
