public class OddOrEven {
    public static void oddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(4);
        oddorEven(0);
        oddorEven(1);
    }
}
