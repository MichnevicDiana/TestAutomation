import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Java_streams {

	public static void ffmain(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alfa");
		names.add("Don");
		names.add("Aleksa");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		// System.out.println(count);
	}

	// @Test
	public void se() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alfanoxa");
		names.add("Don");
		names.add("Aleksa");
		names.add("Adam");
		names.add("Ram");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Alfanoxa", "Don", "Aleksa", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

//@Test
	public void kaz() {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Sama");
		names1.add("Don");
		names1.add("Kukulos");

		Stream.of("Alfanoxa", "Don", "Aleksa", "Adam", "Ram").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		List<String> names = Arrays.asList("Alfanoxa", "Don", "Aleksa", "Adam", "Rama");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// Merging 2 different lists
		Stream<String> newStream = Stream.concat(names1.stream(), names.stream());
		newStream.sorted().forEach(s -> System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));

	}

	public static void main(String[] args) {
		List<String> ls = Stream.of("Alfanoxa", "Don", "Aleksa", "Adam", "Ram").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List <Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		List <Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}

}
