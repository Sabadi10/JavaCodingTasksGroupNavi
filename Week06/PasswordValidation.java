package Week06;
/*
Hello great team <@&1050512057746870339>
Below are :

🏆 **WEEK SIX  JAVA CODING TASKS** 🏆

  **  1) String - Password Validation Task**
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false


**    2) String - sum of digits in a string**
Write a method that can return the sum of the digits in a string


**    3) Array - Find Maximum**
Write a method that can find the maximum number from an int Array
 */

public class PasswordValidation {

    public static boolean PasswordValidations(String password){
        int lowerCase = 0;
        int digit = 0;
        int upperCase = 0;
        int specSimbol = 0;
        char[] arr = password.toCharArray();
        if(password.length()<6){
            return false;
        }else{
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i]>'0' &&arr[i]<='9'){
                    digit++;
                }else if( arr[i]>='a'&&arr[i]<='z'){
                    lowerCase++;
                }else if(arr[i]>='A'&&arr[i]<='Z'){
                    upperCase++;
                }else if(!Character.isLetterOrDigit(arr[i])){
                    specSimbol++;
                }
            }
        }
        return  digit!=0 && lowerCase!=0 && upperCase!=0 && specSimbol!=0;
    }
}
