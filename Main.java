import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);

        printLongestWord();




        //test dine metoder ved at kalde dem her:


    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:


/*TASK 1*/

public String printLongestWord() throws FileNotFoundException 
{

    String longest_word = "";
    String current;
    Scanner sc = new Scanner(new File("C:\Users\Mayas\Desktop\torsdagsopgaver 5  Strings og laes fra fil\Task 1\data.txt"));


    while (sc.hasNext()) {

        current = sc.next();
        if (current.length() > longest_word.length()) {
            longest_word = current;
        }
    }

    System.out.println("\n" +longest_word+ "\n");
        return longest_word;
}



/* TASK 2 */


printFirstHalfOfEachWord() throws FileNotFoundException

{
    String first_half = "";
    String current;
    Scanner sd = new Scanner(new File("C:\Users\Mayas\Desktop\torsdagsopgaver 5  Strings og laes fra fil\Task 1\data.txt"));

   
    System.out.println(first_half.substring(0, first_half.length() / 2));


}

}