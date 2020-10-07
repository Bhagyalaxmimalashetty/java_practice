package javatricks;

import java.util.HashSet;

public class DemoClass {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 5, 5, 6, 6, 6, 8, 0 };
		Object out[] = findDuplicatesfromArr(arr);
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i]);
		}
	}

	private static Object[] findDuplicatesfromArr(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		// =0;
		for (int i=0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		Object[] arr1 = hs.toArray();
		return arr1;
	}

}
