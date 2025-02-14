package programming.coding;

public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		return number==reverse(number);
	}
	
	public static int reverse(int number) {
		int res=0;
		while(number!=0) {
			int mod=number%10;
			res=res*10+mod;
			number=number/10;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(1011));
	}
}
