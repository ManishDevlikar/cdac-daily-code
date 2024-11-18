package password;

public class Password {

    public boolean isValid(String password){
        boolean isValidLength=false;
        boolean isUpper=false;
        boolean isLower=false;
        boolean isSpecial=false;
        boolean isNumeric=false;

        if(password.length()>=9) isValidLength=true;
        
        for(char c : password.toCharArray()){
            if(c>='a'&&c<='z') isLower=true;
            else if(c>='A' && c<='Z') isUpper=true;
            else if(c>='0' && c<='9') isNumeric=true;
            else isSpecial=true;
        }
        return isValidLength&&isLower&&isNumeric&&isSpecial&&isUpper;
    }
}
