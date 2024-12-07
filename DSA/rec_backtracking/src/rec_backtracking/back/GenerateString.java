package rec_backtracking.back;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenerateString {
	int arr[];
	public static void main(String[] args) {
		int n=2;
		GenerateString g = new GenerateString(n);
		g.binary(n);
	}
	public GenerateString(int n) {
		arr=new int[n];
	}
	
	public void binary(int n) {
		if(n<=0) {
			System.out.println(Arrays.toString(arr));
		}else {
			arr[n-1]=0;
			binary(n-1);
			arr[n-1]=1;
			binary(n-1);
		}
	}
	
}
