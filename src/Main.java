import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//
        System.out.println("Welcome to the Pig Latin Translator!: ");

        String answer = "";//declaring string answer you will not get a commit
        //this is the loop to keep translating if the user enters "yes"
        do {
        System.out.println("Enter a word to translate: ");
        String word = scan.next().toLowerCase();//

            //translate the word
            String translated = translate (word);
            //output it
            System.out.println(translated);

            System.out.print("Do you want to continue? yes/no");
            //get the response, turn it to lower case
            answer = scan.next().toLowerCase();
            //answer = scan.next().toLowerCase(); (scan.next gives you a string which shows you what the user inputed
            //answer = answer.toLowerCase();
        } while (answer.equals("yes"));

        scan.close();
    }
    public static String translate(String word) {
        //if the first character is a vowel find the first vowel
        //add way to the end and your done(code this first)/it does not involve a loop see item #2 lab 6

        //else
        //find the first vowel
        int vowel = findVowel(word);
        System.out.println(vowel);
        //if it's an invalid word
        if (vowel == -1) {
            //system return ("Invalid word");
            System.out.println("Invalid word");
            return word;
        }
        //if it's at position zero (pos. 0)
        //add "way" to the end
        //else
        if (vowel == 0) {
            return (word + "way");
        }
        //take the substring from the 1st vowel to the end
            //add the substring from 0 until the (character before the vowel will give you) vowel pos. - 1
            //add "ay"
        else{
            //add the substring from 0 until vowel pos. -1
            return word.substring(vowel, word.length()) + word.substring(0, vowel) + "ay";
        }
    }

    public static int findVowel(String word) {//
        //for loop i from position 0 to 4 (or end of word)
        //for loops create a sequential counter for you
        //use charAt() to get the letter
        //if it's a 'or' 'e' or 'i' or 'o' or 'u'
        //return position(i)
        for (int pos = 0; pos < 4; pos++) {
            char letter = word.charAt(pos);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                return pos;
            }
        }//If no vowel found it will return -1
        return -1;
    }

}
