package programming.coding;

import java.util.HashMap;
import java.util.Set;
public class duplicate {
    public static void main(String[] args) {
        findDuplicate("java is a lang");
    }
    static void findDuplicate(String input){
        HashMap<Character,Integer>count=new HashMap<Character,Integer>();
        char[] strArray=input.toCharArray();
        for(char c:strArray){
        	if(c==' ') {
        		continue;
        	}
            if(count.containsKey(c))
            {
                count.put(c,count.get(c)+1);
            }
            else
            {
                count.put(c,1);
            }
        }
        System.out.println(count);
        Set<Character> strChar=count.keySet();
        System.out.println("String before duplication: "+input);
        for(char ch:strChar ){
            if(count.get(ch)>1){
                System.out.println("duplicates= "+ch+":"+count.get(ch));
            }
        }
    }
}
