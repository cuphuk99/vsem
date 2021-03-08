package Ish.edu.module1;
/*
  @author   Ishtukin Vlad
  @project   vsem
  @class  Palindrome
  @version  1.0.0 
  @since 08.03.2021 - 18.17
*/

public class Palindrome {
    
    public static boolean isPalindrome1(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //remove garbage
        text.toLowerCase();
        boolean result = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)!=text.charAt(text.length()-1-i)){
                result = false;
                break;
            }
        }

        return result;
    }

    // build  a reverse string
    public static boolean isPalindrome2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //remove garbage
        text.toLowerCase();
        boolean result = true;



        return result;
    }
    // use StringBuilder
    public static boolean isPalindrome3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //remove garbage
        text.toLowerCase();
        boolean result = true;



        return result;
    }

    public static void main(String[] args) {
        String text = "qwertrewq";

        System.out.println("The first way "+isPalindrome1(text));
        System.out.println("The second way "+isPalindrome1(text));
        System.out.println("The third way "+isPalindrome1(text));

        System.out.println(text + " isPalindrome " + isPalindrome1(text));

    }
}