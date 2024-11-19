package password;
import java.util.*;

public class Password{
    
    public boolean isValid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password which has 9 characters including [a-zA-Z0-9] and special symbol");
        System.out.println("Enter Password");
        
        String password = sc.nextLine();
        if(isValidLength(password)){
            if(isContains(password)){
                System.out.println("Password Accepted");
                return true;
            }else{
                System.out.println("Enter password which has 9 characters including [a-zA-Z0-9] and special symbol");
                isValid();
            }
        }else{
            System.out.println("Enter password which has 9 characters including [a-zA-Z0-9] and special symbol");
            isValid();
        }
        return true;
    }

    public  boolean isValidLength(String password){
        return password.length()>=9;
    }

    public  boolean isContains(String password){
        boolean isLower=false;
        boolean isUpper=false;
        boolean isDigit=false;
        boolean isAlphanumeric=false;

        for(char c : password.toCharArray()){
            if(c>='a'&&c<='z'){
                isLower=true;
            }else if(c>='A'&&c<='Z'){
                isUpper=true;
            }
            else if(c>='0'&&c<='9'){
                isDigit=true;
            }
            else{
                isAlphanumeric=true;
            }
        }

        return isLower&&isUpper&&isDigit&&isAlphanumeric;
    }
}