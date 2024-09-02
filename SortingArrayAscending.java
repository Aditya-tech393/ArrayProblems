import java.util.Arrays;
public class SortingArrayAscending {

    public static void main(String[] args) {
        int[] array = {50, 20, 40, 10, 30};
        Arrays.sort(array);
        System.out.println("Array elements in ascending order:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
