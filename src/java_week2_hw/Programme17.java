package java_week2_hw;
import java.util.Scanner;

public class Programme17
{
    public static void main(String[] args) {
    //Scanner declaration for reading input form console
    System.out.println("Welcome to Java program to convert decimal to binary numbers");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter decimal number");
    int number = scanner.nextInt();
    convertDecimalToBinary(number);
    //Closing the scanner object
    scanner.close();
}

    // Converting the decimal to binary
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}