/*
 * Amer Stas
 * 4/3/2020
 * This program removbes the first and the last letter of a word until the word ends up with 1 or 2 letters
 */
package lettercuttingassigment;

/**
 *
 * @author canada
 */
import java.util.Scanner;
public class Lettercuttingassigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Allowing to get input from the user
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word");
        //Declaring varibale
        String word= input.nextLine();
        // recursive method
        System.out.println(removeword(word));
    }
    public static String  removeword(String wordre){
        // If the input length is 1 or 2
        if (wordre.length()==1||wordre.length()==2){
            return wordre;
        }
        else{
            // using sub method in order to remove the first and last letters
            // then recalling it.
            System.out.println(wordre);
            return removeword(wordre.substring(1,wordre.length()-1));
        }
}
}    