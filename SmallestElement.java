public class SmallestElement {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
