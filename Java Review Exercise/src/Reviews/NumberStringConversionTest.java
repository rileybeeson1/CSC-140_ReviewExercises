package Reviews;

public class NumberStringConversionTest {
    public static void main(String[] args) {
        int test1 = 123;
        int test2 = -456;
        int test3 = 0;

        System.out.println(NumberStringConversion.numberToString(test1)); // "123"
        System.out.println(NumberStringConversion.numberToString(test2)); // "-456"
        System.out.println(NumberStringConversion.numberToString(test3)); // "0"
    }
}
