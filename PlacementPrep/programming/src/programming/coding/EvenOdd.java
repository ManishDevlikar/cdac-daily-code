package programming.coding;

public class EvenOdd {
	public static void main(String[] args) {
		isOddEven(0);
		System.out.println(5/2);
	}
	public static void isOddEven(int num) {
		if((num&1)==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
