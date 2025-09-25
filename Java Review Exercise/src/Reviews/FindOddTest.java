package Reviews;

public class FindOddTest {
    public static void main(String[] args) {
        int[] test1 = {1, 1, 2};
        int[] test2 = {2, 3, 2, 3, 3, 2, 5, 2, 3};
        int[] test3 = {10};

        System.out.println(FindOdd.findIt(test1)); // 2
        System.out.println(FindOdd.findIt(test2)); // 5
        System.out.println(FindOdd.findIt(test3)); // 10
    }
}
