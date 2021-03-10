package Ish.edu.module1;
/**
  @author   Ishtukin Vlad
  @project   vsem
  @class  Palindrome
  @version  1.0.0 
  @since 08.03.2021 - 18.17
*/

public class Palindrome {
    /////////////////////////////////////////////////////////////////////
    //compare method
    public static boolean isPalindrome1(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //remove garbage
        text = text.toLowerCase();
        boolean result = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)!=text.charAt(text.length()-1-i)){
                result = false;
                break;
            }
        }

        return result;
    }

/////////////////////////////////////////////////////////////////////////////////////////////
    // use StringBuilder
    public static boolean isPalindrome2(String text) {

        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //remove garbage
        text = text.toLowerCase();

        StringBuilder builder = new StringBuilder(text);
        String reversed = builder.reverse().toString();
        
       /* boolean result = true;
        if (text.equals(reversed)){

        } else {
            result = false;
        }*/

        return (reversed.equals(text));
    }
    /////////////////////////////////////////////////////////////////////////////////////

    // build  a reverse string
    public static boolean isPalindrome3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "").toLowerCase(); //remove garbage and to lower case
        String reversed = "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            reversed += text.charAt(i);
        }
        return (reversed.equals(text));
    }

    /////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        String text1 = "А роза упала на лапу Азора";
        String text2 = "Я несу гусеня";
        String text3 = "Иди, иди";

        System.out.println(" The first way");
        System.out.println(   text1 + " is a palindrom   - " + isPalindrome1(text1));

        System.out.println(" The second way");
        System.out.println(   text2 + " is a palindrom   - " + isPalindrome2(text2));

        System.out.println(" The third way");
        System.out.println(   text3 + " is a palindrom   - " + isPalindrome3(text3));

    }
}