package mapExamples;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreemap {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new TreeMap<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		numbers.put("five", 5);
		numbers.put("five", 59);
		
		System.out.println(numbers);
		
		numbers.remove("five");
		System.out.println(numbers);
	}

}
