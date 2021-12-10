import java.util.Arrays;

public class myBubbleSort {

	public static void main(String[] args) {
		
		int[] array = new int[] {5, 2, 6, 1}; // 2, 5, 1, 6 //1, 2, 5, 6
		System.out.println(Arrays.toString(bubblesort(array)));

	}
	
	public static int[] bubblesort(int[] array) {
		
		boolean isSorted = false;
		int lastUnsorted = array.length - 1;
		
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < lastUnsorted; i++) {
				if(array[i] > array[i+ 1]) {
					swap(array, i, i + 1);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
		
		return array;
		
	}
	
	public static void swap(int[] array, int i, int j) {
		
		int tempLeft = array[i];
		array[i] = array[j];
		array[j] = tempLeft;
		
	}


}
