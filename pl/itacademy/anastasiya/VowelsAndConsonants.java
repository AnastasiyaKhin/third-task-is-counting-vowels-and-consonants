package pl.itacademy.anastasiya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsAndConsonants {
    public static int countVowel(String str) {
        Pattern vowel = Pattern.compile("[a,e,i,o,u]");
        Matcher matcher = vowel.matcher(str);
        int vowelCount = 0;
        while (matcher.find()) {
            vowelCount++;
        }
        return vowelCount;
    }

    public static int countConsonants(String str) {
        int charCount = 0;
        for (char every : str.toCharArray()) {
            if (Character.isAlphabetic(every)) {
                charCount++;
            }
        }
        return charCount - countVowel(str);
    }
}
