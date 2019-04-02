package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    static void testPalindrome(File file) {
        try {
            WordInspection insp = new WordInspection(file);
            List<String> wordlist = insp.palindromes();
            for (String string : wordlist) {
                System.out.println(string);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error: " + ex);
        }
    }

    static void testContainsAllVowells(File file) {
        try {
            WordInspection insp = new WordInspection(file);
            List<String> wordlist = insp.wordsWhichContainAllVowels();
            for (String string : wordlist) {
                System.out.println(string);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error: " + ex);
        }
    }

    public static void main(String[] args) {
        // test your code here

        //File file = new File("src/shortList.txt");
        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        //testPalindrome(file);
        testContainsAllVowells(file);

    }
}
