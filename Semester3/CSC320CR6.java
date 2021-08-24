import java.util.Scanner;

public class CSC320CR6 {

    public static String getWord(String newWord) throws Exception {
        Character firstLetter = newWord.toLowerCase().charAt(0);
        Character trueChar = 'm';
        Boolean isTrue = firstLetter.equals(trueChar);

        if (!isTrue) {
           throw new Exception("\nYour Word Does not Start with M");
        }
        return newWord;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String newWord;
  
        for (int i=0; i<3; i++) {
            System.out.println("\nEnter a Word that begins with M:");
            newWord = scnr.nextLine();
           try {
              getWord(newWord);
              System.out.println("Succsess");
           } catch (Exception excpt) {
              System.out.println(excpt.getMessage());
              System.out.println("Failure");
           }
        }
        scnr.close();
     }
}