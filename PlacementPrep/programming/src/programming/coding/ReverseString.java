package programming.coding;

public class ReverseString {
	public static void main(String[] args) {
		String str ="manish";
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		String s="";
		for(char c:str.toCharArray()) {
			s=c+s;
		}
		return s;
	}
}
