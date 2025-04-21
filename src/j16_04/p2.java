package j16_04;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class p2 {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("madhu","vinay","pradeep","sindhu","sravani","karthik");
		Stream<Integer> i=Stream.of(1,2,3);
		IntStream t= IntStream.range(1,2);
		l.stream()
		.map(String::toUpperCase)
		.filter(name->name.startsWith("V"))
		.sorted()
		.forEach(System.out::println);
	}

}