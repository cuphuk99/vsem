package Ish.edu.module2.class_design.inheritance;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class MyInteger
 * @since 26.03.2021 - 19.13
 */

public class MyInteger {
    public static boolean isPrime(int num){
        boolean result = true;
        int counter = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                counter++; // if the counter will be more than 0 it means that its not a prime number
            }
        }

        if (counter != 0 || num == 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(MyInteger.isPrime(1));
        System.out.println(MyInteger.isPrime(3));
        System.out.println(MyInteger.isPrime(6));
        System.out.println(MyInteger.isPrime(37));

    }
}