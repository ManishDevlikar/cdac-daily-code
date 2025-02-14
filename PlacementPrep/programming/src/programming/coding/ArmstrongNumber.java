package programming.coding;

/*
 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. 
 */

public class ArmstrongNumber {
	public static boolean isArmstrong(int number) {
		return number==armstrong(number);
	}
	
	
	private static int armstrong(int number) {
		int raiseTo=getTotalDigits(number);
		int sum=0;
		while(number!=0) {
			int digit=number%10;
			sum+=getPowerToValue(digit,raiseTo);
			number/=10;
		}
		return sum;
	}
	
//	private static int getTotalDigits(int number) {
//		return !String.valueOf(number).equals("0")?String.valueOf(number).length():0;
//	}
	
//	 static int getTotalDigits(int number) {
//		return number==0?0:String.valueOf(number).length();
//	}
	
	private static int getTotalDigits(int number) {
		int count=0;
		while(number!=0) {
			++count;
			number=number/10;
		}
		return count;
	}
	
	private static int getPowerToValue(int number,int power) {
		int result=1;
		for(int i=0;i<power;i++) {
			result=result*number;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int data=153;
		System.out.println("input: "+data);
		System.out.println("armstrong value: "+armstrong(data));
		System.out.println("isArmstrong: "+isArmstrong(data));
	}
}
