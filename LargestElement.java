public class LargestElement {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}
