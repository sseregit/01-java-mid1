package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress 서울 = new ImmutableAddress("서울");

        MemberV2 회원A = new MemberV2("회원A", 서울);
        MemberV2 회원B = new MemberV2("회원B", 서울);

        System.out.println("회원A = " + 회원A);
        System.out.println("회원B = " + 회원B);

        회원B.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("회원A = " + 회원A);
        System.out.println("회원B = " + 회원B);

    }
}
