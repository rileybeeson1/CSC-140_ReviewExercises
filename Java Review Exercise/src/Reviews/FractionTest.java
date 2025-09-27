package Reviews;

public class FractionTest {
    public static void main(String[] args) {
        // Basic fractions
        Fraction f1 = new Fraction(1, 2);   // 1/2
        Fraction f2 = new Fraction(3, 4);   // 3/4
        Fraction f3 = new Fraction(2, 4);   // reduces to 1/2 after add

        // Print them
        System.out.println("f1 = " + f1);   // expect 1/2
        System.out.println("f2 = " + f2);   // expect 3/4
        System.out.println("f3 = " + f3 + '\n');   // expect 2/4 because we haven't added

        // Addition tests
        System.out.println("f1 + f2 = " + f1.add(f2)); // 1/2 + 3/4 = 5/4
        System.out.println("f1 + f3 = " + f1.add(f3)); // 1/2 + 2/4 = 4/8 + 4/8 = 8/8 = 1/1 = 1

    }
}