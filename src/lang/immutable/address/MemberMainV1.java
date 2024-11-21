package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address 서울 = new Address("서울");

        MemberV1 회원A = new MemberV1("회원A", 서울);
        MemberV1 회원B = new MemberV1("회원B", 서울);

        System.out.println("회원A = " + 회원A);
        System.out.println("회원B = " + 회원B);

        회원B.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("회원A = " + 회원A);
        System.out.println("회원B = " + 회원B);

    }
}
