public class ReversingArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Elements of the array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
