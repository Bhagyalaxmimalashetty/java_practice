package javatricks;

import java.util.Optional;

public class OptionalMian {

	public static void main(String[] args) {
		Optional<String> string = Optional.empty();

		// previous approch to check null
		String book = null;
		if (book != null) {
			System.out.println(book.toUpperCase());
		} else {
			book = "Java 8";
			System.out.println(book.toUpperCase());
		}

		// to check using Optional class
		// string=Optional.of(book);//it will through null if it string value is null
		String book1 = null;
		string = Optional.ofNullable(book1);
		// if(string.isPresent())
		// System.out.println(string.get().toUpperCase());//only in case of if condition
		System.out.println(string.orElse("Java8").toUpperCase());// in case of if and else

	}

}
