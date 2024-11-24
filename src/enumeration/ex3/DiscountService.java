package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        switch (grade) {
            case BASIC -> discountPercent = 10;
            case GOLD -> discountPercent = 20;
            case DIAMOND -> discountPercent = 30;
        }

        return price * discountPercent / 100;
    }
}
