package java_week2_hw;
import java.util.Scanner;

public class Programme7
{
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        // Object creation
        Programme7 t = new Programme7();
        t.convertTempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    }

    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }
}
