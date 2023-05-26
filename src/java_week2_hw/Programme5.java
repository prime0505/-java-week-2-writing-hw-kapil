package java_week2_hw;

import java.util.Scanner;

public class Programme5
{
    public static void addition(int a, int b)
    {
        int result= a+b;
        System.out.println("The addition of "+a+"and" +b+"is :"+result);
    }
    public static int  subtraction(int a, int b)
    {
        int result= a-b;
        System.out.println("The substraction of "+a+"and"+b+"is :"+result);
        return result;


    }
    public static void multiplication(int a,int b)
    {
            int result= a*b;
        System.out.println("The multiplication of "+a+"and"+b+"is: "+result);
    }
    public int division(int a,int b)
    {
        int result= a/b;
        System.out.println("The division of "+a+"and"+b+"is :"+result);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a= sc.nextInt();
        System.out.println("Please enter the number :");
        int b =sc.nextInt();
        addition(a,b);
        int sunResult = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + sunResult);
        Programme5 p5 =new Programme5();
        p5.multiplication(a,b);
        int divResult = p5.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);

    }
}
