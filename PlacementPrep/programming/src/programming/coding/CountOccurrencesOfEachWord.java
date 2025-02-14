package programming.coding;

public class CountOccurrencesOfEachWord {
	public static void getOccurrences(String str) {
		String[] strArr = str.split(" ");
		boolean[] flags=new boolean[strArr.length];
		
		for(int i=0;i<strArr.length;i++) {
			int count=1;
			
			if(!flags[i]) {
				for(int j=i+1;j<strArr.length;j++) {
					if(strArr[i].equalsIgnoreCase(strArr[j])) {
						count++;
						flags[j]=true;
					}
				}
				System.out.println(strArr[i]+" "+count);
			}
		}
	}
	public static void main(String[] args) {
		String str="java is a oop language java is my fav langUAGE";
		getOccurrences(str);
	}
}
