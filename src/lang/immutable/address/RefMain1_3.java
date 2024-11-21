package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address 서울 = new Address("서울");
        Address 어디 = 서울;

        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);

        change(어디, "부산");
        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);

    }
}
