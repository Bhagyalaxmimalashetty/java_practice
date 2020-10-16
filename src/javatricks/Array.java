package javatricks;

public class Array {
	private int[] items;
	private int count;
	//just a comment to test
	public Array(int length) {
		items = new int[length];
	}

	public void insert(int item) {
		// if the array is full resize the array with double value
		if (items.length == count) {
			int[] newItem = new int[count * 2];
			// add all previous array elements to new array
			for (int i = 0; i < count; i++) {
				newItem[i] = items[i];
			}
		}
		items[count++] = item;
	}

	public void print() {
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}

	public void removeAt(int index) {
		// validate the index
		if (index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		// if any specific item removed from index we will shift the items left/right
		// specific to index
		for (int i = index; i < count; i++) {
			items[i] = items[i + 1];
			count--;
		}
	}

	public int indexOf(int item) {
		// if the passed index is equal to items[] index then return that value else
		// return -1
		for (int i = 0; i < count; i++)
			if (items[i] == item)
				return i;

		return -1;
	}

	public static void main(String[] args) {
		Array[] ar = new Array[3];
	}
}
