package programming.coding;

import java.util.HashMap;

public class CountOccurrencesOfEachWordHM {
	
	public static HashMap<String,Integer> getOccurrences(String str){
		HashMap<String,Integer> hm = new HashMap<>();
		for(String s:str.toLowerCase().split(" ")) {
			if(!s.isEmpty()) {
				hm.put(s, hm.getOrDefault(s, 0)+1);
			}
		}
		return hm;
	}
	
	public static void main(String[] args) {
		System.out.println(getOccurrences("java is oop lang java is simple lang"));
	}
}
