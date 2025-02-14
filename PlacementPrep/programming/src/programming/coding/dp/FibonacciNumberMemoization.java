package programming.coding.dp;

import java.util.HashMap;

public class FibonacciNumberMemoization{
	static HashMap<Integer,Long> memo = new HashMap<>();
	
	public static long getFibonacci(int number) {
		if(number==0) return 0;
		if(number==1) return 1;
		
		if(memo.containsKey(number))
			return memo.get(number);
		
		long result = getFibonacci(number-1)+getFibonacci(number-2);
		memo.put(number, result);
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getFibonacci(11));
	}
}
