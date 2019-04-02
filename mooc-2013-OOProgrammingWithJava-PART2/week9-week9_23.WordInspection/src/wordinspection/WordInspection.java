
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WordInspection {
    private final File file;
    private Scanner reader;

    public WordInspection(File file) {
        this.file = file;
    }

    public List<String> getWordList()  throws FileNotFoundException {
        ArrayList<String> wordlist = new ArrayList<String>();
        reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String text = reader.next();
                wordlist.add(text);
        }
        reader.close();

        return wordlist;
    }



    public int wordCount() throws FileNotFoundException {
        int count = 0;

        List<String> wordlist = getWordList();
        for (String text : wordlist) {
            count++;
        }

        return count;
    }

     public List<String> wordsContainingZ()  throws FileNotFoundException {
        List<String> wordlist = new ArrayList<String>();
        for (String text : getWordList()) {
            if (text.contains("z") || text.contains("Z")) {
                wordlist.add(text);
            }
        }

        return wordlist;
     }

     public List<String> wordsEndingInL()  throws FileNotFoundException {
        List<String> wordlist = new ArrayList<String>();
        for (String text : getWordList()) {
            if (text.endsWith("L") || text.endsWith("l")) {
                wordlist.add(text);
            }
        }

        return wordlist;
     }

      public List<String> palindromes()   throws FileNotFoundException {
        List<String> wordlist = new ArrayList<String>();
        for (String text : getWordList()) {
            if (isPalindrome(text)) {
                wordlist.add(text);
            }
        }

        return wordlist;
      }

      private boolean isPalindrome(String word) {
          String reverse = "";
          for (int i = word.length()-1; i >= 0; i--) {
              reverse = reverse + word.charAt(i);
          }
          return word.equals(reverse);
      }

      public List<String> wordsWhichContainAllVowels()  throws FileNotFoundException {
        List<String> wordlist = new ArrayList<String>();
        for (String text : getWordList()) {
            if (text.contains("a") && text.contains("e") && text.contains("i")
                  &&  text.contains("o") && text.contains("u") && text.contains("y")
                  && text.contains("ä") && text.contains("ö")) {
                wordlist.add(text);
            }
        }

        return wordlist;
      }
}
