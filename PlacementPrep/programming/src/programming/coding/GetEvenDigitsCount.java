package programming.coding;

public class GetEvenDigitsCount {
	public static int getEvenDigits(int number) {
		int count=0;
		while(number!=0) {
			int mod=number%10;
			if((mod&1)==0) {
				count++;
			}
			number=number/10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(getEvenDigits(19838));
		
	}
}
