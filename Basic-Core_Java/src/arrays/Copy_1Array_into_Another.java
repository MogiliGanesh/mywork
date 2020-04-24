package arrays;

public class Copy_1Array_into_Another {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		// Create another array arr2 with size of arr1
		int arr2[] = new int[arr1.length];
		// Copying all elements of one array into another
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	}
}
