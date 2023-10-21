package leetCode_2119_numberAfterDoubleReversal;

public class numberAfterDoubleReversal {
    public static boolean isSameAfterReversals(int num) {

        int reversed1 = Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString());
        int reversed2 = Integer.valueOf(new StringBuilder(String.valueOf(reversed1)).reverse().toString());

        return reversed2 == num;
    }

    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(45));

    }
}
