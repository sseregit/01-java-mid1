package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress 서울 = new ImmutableAddress("서울");
        ImmutableAddress 어디 = 서울;

        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);

        어디 = new ImmutableAddress("부산");
        System.out.println("어디 -> 부산");
        System.out.println("서울 = " + 서울);
        System.out.println("어디 = " + 어디);
    }
}
