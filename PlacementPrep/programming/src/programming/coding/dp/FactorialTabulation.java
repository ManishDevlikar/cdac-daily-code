package programming.coding.dp;
/*
Bottom-Up Approach (Tabulation - Iterative)
In this approach, we compute factorial iteratively and store intermediate results in an array.
 */
public class FactorialTabulation {
	public static int getFactorial(int num) {
		int[] store = new int[num+1];
		store[0]=1;
		for(int i=1;i<=num;i++) {
			store[i]=i*store[i-1];
		}
		return store[num];
 	}
	public static void main(String[] args) {
		System.out.println(getFactorial(10));
	}
}
