package javatricks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(34,56,12,3,4,5);
		List doubleList=intList.stream().map(l -> l * 2).collect(Collectors.toList());
		//doubleList.forEach( System.out::println);
		char i=96;// this will return unicode ~
		int c='d';// this will return unicode 100
		int t=027; // this will print 23 by converting to octal value(7*8^0+2*8^1)
		
		byte $=10;
		byte k=10;
				byte s=(byte) ($+k);
		System.out.println(s);
		//System.out.println(i);
	}

}
