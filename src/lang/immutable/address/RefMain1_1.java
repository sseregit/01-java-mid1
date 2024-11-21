package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        Address 서울 = new Address("서울");
        Address 어디 = 서울;

        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);

        어디.setValue("부산");
        System.out.println("어디 -> 부산");
        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);
    }
}
