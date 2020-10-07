package javatricks;

import java.util.Optional;

interface MyBookService{
	public String getBook();
}

public class OptionalMain2 {
	public static void main(String[] args) {
		String book=null;
		Optional<String> bookOptional=Optional.ofNullable(book);
		//get() method will throw NosuchElementException if there is no value in string variable
		//to over come this we can use orElse()method of Optinal class
		System.out.println(bookOptional.orElse("JAVA8")); 
		
		//using orElseGet() method to access book
		System.out.println(bookOptional.orElseGet( () -> "Java9"));
		
		//Using orElseThrow
		System.out.println(bookOptional.orElseThrow(IllegalArgumentException::new));
		
	}
}
