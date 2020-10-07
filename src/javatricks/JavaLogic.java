package javatricks;

public class JavaLogic {

	public static void main(String[] args) {

		decreaseNumberByOne(2);
	}

	private static void decreaseNumberByOne(int i) {
		if (i >= 0) {
			decreaseNumberByOne(i - 1);
		}
		System.out.println("Num" + i);

	}

}
