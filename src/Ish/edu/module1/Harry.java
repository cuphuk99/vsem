package Ish.edu.module1;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Harry
 * @since 10.03.2021 - 19.44
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("D:\\BestBrain\\Java kurs\\harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");
        String stringOfDistinct = "";
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistinct.contains(words[i])){
                stringOfDistinct += words[i]+ " ";
            }
        }
        String[] distincts  = stringOfDistinct.split(" ");
        Arrays.sort(distincts);
        for (int i = 0; i < words.length; i++) {
            System.out.println(distincts[i]);
        }
    }
}