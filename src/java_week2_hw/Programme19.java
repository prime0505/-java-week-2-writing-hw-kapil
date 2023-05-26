package java_week2_hw;
import java.util.Scanner;

public class Programme19
{
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme19 t = new Programme19();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();

    }

    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
