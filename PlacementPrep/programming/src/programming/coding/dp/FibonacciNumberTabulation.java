package programming.coding.dp;

public class FibonacciNumberTabulation {
	
	public static long getFibonacci(int number) {
		if(number==0) return 0;
		if(number==1) return 1;
		long[] num = new long[number+1];
		num[0]=0;
		num[1]=1;
		
		for(int i=2;i<=number;i++) {
			num[i]=num[i-1]+num[i-2];
		}
		
		return num[number];
	}
	public static void main(String[] args) {
		System.out.println(getFibonacci(0));
	}
}
