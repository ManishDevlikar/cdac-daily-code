package programming.coding;

public class CountWords {
	
	static public int getCount(String string) {
		return string.split(" ").length;
	}
	public static void main(String[] args) {
		System.out.println(getCount("my name is manish"));
	}
}
