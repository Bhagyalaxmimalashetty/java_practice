package javatricks;

import java.util.Iterator;
import java.util.TreeSet;

class Drink implements Comparable {
	public String name;

	@Override
	public int compareTo(Object arg0) {

		return 0;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + "]";
	}

}

public class TreeSetExample {

	public static void main(String[] args) {
		Drink one = new Drink();
		//Drink two = new Drink();
		one.name = "Coffe";
		one.name = "Tea";
		TreeSet set = new TreeSet();
		set.add(one);
	//	set.add(two);
		Iterator<Drink> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}

}
