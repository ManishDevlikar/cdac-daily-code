package programming.coding;

public class StrongNumber {
	static public boolean isStrong(int number) {
		return number==getStrong(number);
	}
	
	private static int getStrong(int number) {
		int result=0;
		while(number!=0) {
			int mod=number%10;
			result+=getFactorial(mod);
			number/=10;
		}
		return result;
	}
	
	private static int getFactorial(int number) {
		var result=1;
		for(int i=1;i<number;i++)
			result+=i*result;
		return result;
	}
	
	public static void main(String[] args) {
		int data=145;
		System.out.println("Strong value: "+getStrong(data));
		System.out.println("isStrongNumber: "+isStrong(data));
		
	}
}
