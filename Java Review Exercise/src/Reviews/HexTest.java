package Reviews;

public class HexTest {
    public static void main(String[] args) {
        Hex ff = new Hex(255);

        // toString / toJSON
        System.out.println("toString: " + ff.toString()); // expect 0xFF
        System.out.println("toJSON:   " + ff.toJSON());   // expect 0xFF

        // valueOf
        System.out.println("valueOf + 1: " + (ff.valueOf() + 1)); // expect 256

        // equals
        System.out.println("equals same: " + ff.equals(new Hex(255))); // true
        System.out.println("equals diff: " + ff.equals(new Hex(10)));  // false
        System.out.println("equals wrong type: " + ff.equals("FF"));   // false

        // plus / minus with Hex
        Hex a = new Hex(10);
        Hex b = new Hex(5);
        System.out.println("a.plus(b): " + a.plus(b));   // expect 0xF (15)
        System.out.println("a.minus(b): " + a.minus(b)); // expect 0x5 (5)

        // plus / minus with int
        System.out.println("a.plus(2): " + a.plus(2));   // expect 0xC (12)
        System.out.println("a.minus(2): " + a.minus(2)); // expect 0x8 (8)

        // parse
        System.out.println("parse 0xFF: " + Hex.parse("0xFF")); // 255
        System.out.println("parse FF:   " + Hex.parse("FF"));   // 255
        System.out.println("parse a9:   " + Hex.parse("a9"));   // 169
        System.out.println("parse with spaces: " + Hex.parse("   1F  ")); // 31
    }
}
