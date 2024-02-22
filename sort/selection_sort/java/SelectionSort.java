import java.util.Arrays;

public class SelectionSort {
	 
    public static void sort(int[] array) {
 
        for (int i = 0; i < array.length; i++) {
            int minor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minor]) {
                    minor = j;
                }
            }
            swap(array, i, minor);
        }
    }

	private static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
		
	}
	
}
