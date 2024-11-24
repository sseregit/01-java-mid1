package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long start, end;

        // 기본형
        long sumPrimitive = 0;
        start = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        end = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (end - start) + "ms");

        // 래퍼
        // 기본형
        Long sumWrapper = 0L;
        start = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        end = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (end - start) + "ms");

    }
}
