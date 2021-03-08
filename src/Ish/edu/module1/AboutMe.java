package Ish.edu.module1;
/*
  @author   Ishtukin Vlad
  @project   vsem
  @class  AboutMe
  @version  1.0.0 
  @since 08.03.2021 - 18.14
*/

public class AboutMe {

    public static void main(String[] args) {
        System.out.println("Facts about me");

        byte myAge = 21;
        System.out.println("Hi. My name is Vlad. I am " + myAge + " years old.");
        // 2^16 = 65000
        short year = 2021;
        System.out.println("It is " + year + " year now");
        // 2^32 = 2 000 000 000
        int monthSalary = 66666;
        System.out.println("I'd to get "+monthSalary+" a month till the 25 years.");
        //long 2^64

        long numberOfMolecules = 3_200_000_000l;
        System.out.println("As all humans I have about a " + numberOfMolecules + " molecules in my DNA");

        //float
        float myWeight = 3.25f;
        System.out.println("I was born with the "+myWeight+" weight");

        //double
        double MyWeightNow = 71.1415926;
        System.out.println("And now its about "+MyWeightNow);

        //char
        char IESymbol = 'e';
        System.out.println("Of course i love some memes so here is one 'this is internet explorer logo' => '"+IESymbol+"'");

        //bool
        boolean fact = true;
        System.out.println("And this is " + fact + " story");

        String text = "So even if it is a horrible story about myself Im pretty glad I did it";
        System.out.println(text);


    }
}
