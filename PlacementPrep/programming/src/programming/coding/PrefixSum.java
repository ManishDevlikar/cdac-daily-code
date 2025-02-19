package programming.coding;

import java.util.LinkedList;
import java.util.List;

public class PrefixSum {
	public static int prefix(int[] arr, int k) {
		if (k >= arr.length || k <= 0)
			return -1;
		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = arr[i] + prefix[i - 1];
		}
		return prefix[k - 1];
	}

	public static void main(String[] args) {
		System.out.println(prefix(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
//		String name = "Kunal";
//		int h = name.hashCode();
//		System.out.println(h);
//		List<String> list = new LinkedList<>();
//		list.add("o");
//		list.add(String.valueOf(20));
//		list.forEach(System.out::println);

	}
}
