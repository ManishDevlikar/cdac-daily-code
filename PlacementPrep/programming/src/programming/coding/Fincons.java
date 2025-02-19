package programming.coding;

import java.util.ArrayList;

public class Fincons {
	public static void main(String[] args) {
		int combinations = getCombinations(4, 2);
		System.out.println(combinations);
		int combinations2 = getCombinations(5, 3);
		System.out.println(combinations2);
	}
	public static int getCombinations(int num1,int num2) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i=1;i<=num1;i++) {
			for(int j=i+1;j<=num1;j++) {
				ArrayList<Integer> pair = new ArrayList<>();				
				pair.add(i);
				pair.add(j);
				if(!pair.isEmpty()) {				
					list.add(pair);
				}
			}
		}
		int count = 0;
		for(int j=1;j<num2;j++) {			
			for(int i=0;i<list.size();i++) {
					count++;	
			}
		}
		return count+num1;
	}
}
