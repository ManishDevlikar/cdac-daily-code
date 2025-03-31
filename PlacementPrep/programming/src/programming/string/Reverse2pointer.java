package programming.string;

public class Reverse2pointer {
	public static void main(String[] args) {
		String str="java programming";
		
		String[] arr=str.split(" ");
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			String temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		String result ="";
		
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length)
			result+=arr[i]+" ";
		}
		
		System.out.println(result);
	}
}
