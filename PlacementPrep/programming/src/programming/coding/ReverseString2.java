package programming.coding;

import java.util.Scanner;

public class ReverseString2 {
        String reverse(String str){
        String org_str=str;
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
        rev=rev+str.charAt(i);
        }
        if(rev.equals(org_str))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String string=sc.nextLine();

        ReverseString2 obj = new ReverseString2();
        String abc=obj.reverse(string);
        System.out.println("reversed string = "+abc);
    }
}
