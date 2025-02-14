package programming.coding.dp;

import java.util.HashMap;

/*
 Top-Down Approach (Memoization - Recursive)
In this approach, we use recursion and store already computed values in a 
HashMap to avoid redundant calculations.
 */

public class FactorialMemoization {
	static HashMap<Integer,Long> memo = new HashMap<>();
	public static long getFactorial(int number) {
		if(number==0||number==1) {
			return 1;
		}
		if(memo.containsKey(number)) {
			return memo.get(number);
		}
		long result=number*getFactorial(number-1);
		memo.put(number, result);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}
}
