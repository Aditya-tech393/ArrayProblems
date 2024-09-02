public class FindEvenElements {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        System.out.println("Elements at even positions in the array:");
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
