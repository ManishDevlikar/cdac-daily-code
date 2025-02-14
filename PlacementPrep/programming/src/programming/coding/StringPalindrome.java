package programming.coding;

public class StringPalindrome {
	public static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	private static String reverse(String str) {
		char[] carr = str.toCharArray();
		int start=0;
		int last=str.length()-1;
		while(start<last) {
			char temp = carr[start];
			carr[start]=carr[last];
			carr[last]=temp;
			start++;
			last--;
		}
		return new String(carr);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("suzy"));
	}
}
