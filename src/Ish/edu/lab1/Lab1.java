package Ish.edu.lab1;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Lab1
 * @since 15.03.2021 - 18.03
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:\\BestBrain\\Java kurs\\harry.txt")));
        String[] lines = text.split("\r\n");

        text = text.replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");
        String stringOfC = "";
        String stringOfDistinct = "";
        String longestWord = "";

        int counterOfHarry = 0;
        // making of a distinct words array
        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistinct.contains(words[i])){
                stringOfDistinct += words[i]+ " ";
            }
        }
        //count Harry lines
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry")){
                counterOfHarry++;
            }
        }
        String[] distincts  = stringOfDistinct.split(" ");
        Arrays.sort(distincts);

        int[] arrOfHashes = new int [distincts.length];
        //finding the longest word and output of the distinct array
        System.out.println("All distincts words of the text: ");
        for (int i = 0; i < distincts.length; i++) {
            //finding the longest word
            if (distincts[i].length()>longestWord.length()){
                longestWord = distincts[i];
            }
            //checking the C begining
            if (distincts[i].startsWith("C")){
               stringOfC += distincts[i]+ " ";
            }
            arrOfHashes[i] = distincts[i].hashCode();

            System.out.println(distincts[i]);
        }
        String[] wordsC  = stringOfC.split(" ");
        System.out.println(" ");
        System.out.println("All words that starts with C: ");
        for (int i = 0; i < wordsC.length; i++) {
            System.out.println(wordsC[i]);
        }

        Arrays.sort(arrOfHashes);
        int counterOfIntersections = 0;
        System.out.println(" ");
        for (int i = 0; i < arrOfHashes.length-1; i++) {
            if (arrOfHashes[i]==arrOfHashes[i+1]){
                counterOfIntersections++;
            }
            System.out.println(arrOfHashes[i]);

        }
        System.out.println(" ");
        System.out.println(counterOfIntersections + " is the count of the intersections");
        System.out.println(" ");
        System.out.println(longestWord + " is the longest word of all text");
        System.out.println(" ");
        System.out.println(counterOfHarry + " is the count of lines that contains 'Harry' word");
        System.out.println(wordsC.length);

    }
}
