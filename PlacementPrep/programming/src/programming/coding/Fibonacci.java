package programming.coding;

public class Fibonacci {
	public static int getFibonacci(int number) {
		int first=0;
		int second=1;
		int result=0;
		for(int i=2;i<=number;i++) {
			result=first+second;
			first=second;
			second=result;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getFibonacci(11));
	}
}
