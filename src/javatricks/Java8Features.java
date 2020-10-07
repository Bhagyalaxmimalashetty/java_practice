package javatricks;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Java8Features {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User(1, "Bhagya", 30));
		list.add(new User(2, "Ammu", 4));
		list.add(new User(3, "Chetu", 06));
		list.add(new User(4, "Mahesh", 25));
		list.add(new User(5, "Vijaylaxmi", 32));
		list.add(new User(6, "Mahantesh", 36));
		list.add(new User(7, "KalyanRao", 62));
		list.add(new User(8, "Ambubai", 56));

		// to convert object of type Iterable to Stream,(Using StreamSupport and
		// splititerator method we can achive this
		// boolean value true=parallel streaming of data, false=sequential
		Iterable<String> array = Arrays.asList("Bhagya", "Darshu", "Shru", "Manji", "Pinkus");
		StreamSupport.stream(array.spliterator(), true).forEach(System.out::println);

		// iterate objects accoriding to greater than 4
		long count = list.stream().filter(usr -> usr.getAge() > 4).count();
		// System.out.println(count);

		// to get the name of the users whose age is >30 using map and collect terminal
		// operations
		List<String> usrs = list.stream().filter(usr -> usr.getAge() > 30).map(usr -> usr.getName())
				.collect(Collectors.toList());
		// usrs.forEach(System.out::println);

		// to get usernames in alphabetic orders
		Set<String> groupedNames = list.stream().map(usr -> usr.getName())
				.collect(Collectors.toCollection(TreeSet::new));
		// System.out.println(groupedNames);

		// gropu users by age
		Map<Integer, List<User>> ageOrdered = list.stream().collect(Collectors.groupingBy(usr -> usr.getAge()));
		System.out.println(ageOrdered);

		System.out.println("Current local date is " + LocalDateTime.now(ZoneId.of("UTC")));

		// Create 5 random numbers in java 8
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);

		// To sum all ints in list

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		// Added the numbers into Arraylist
		System.out.println(sum(list1));

		// To get min and max value from stream
		Integer highest = Stream.of(1, 2, 3, 77, 6, 5).max(Comparator.comparing(Integer::valueOf)).get();

		Integer lowest = Stream.of(1, 2, 3, 77, 6, 5).min(Comparator.comparing(Integer::valueOf)).get();
	}

	public static int sum(ArrayList<Integer> list) {
		return list.stream().mapToInt(i -> i).sum();
	}

}
