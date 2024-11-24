package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        int basic = BASIC.discount(price);
        int gold = GOLD.discount(price);
        int diamond = DIAMOND.discount(price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
