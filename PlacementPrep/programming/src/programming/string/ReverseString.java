package programming.string;



public class ReverseString {
	public static String getReverseString(String str) {
		str = str.strip();
		String[] temp = str.split(" ");
		String res1 = "";

		for (int i = 0; i < temp.length; i++) {
			res1 = temp[i] + " " + res1;
		}

		return res1.trim();
	}

	public static void main(String[] args) {
		String str = "welcome  to thane";
		System.out.println(getReverseString(str));

	}

}
