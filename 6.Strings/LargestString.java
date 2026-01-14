public class LargestString {
    public static String getLargestString(String[] names) {
        String largest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (largest.compareToIgnoreCase(names[i]) < 0) {
                largest = names[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] names = { "apple", "banana", "mango" };
        System.out.println(getLargestString(names));
    }
}
