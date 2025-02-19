package programming.coding;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurrenceOfCharacter {
	public static void main(String[] args) {
		System.out.println(count("my name is manish"));
	}

	public static Map<Character, Integer> count(String str) {
		char[] cArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : cArr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}
}
