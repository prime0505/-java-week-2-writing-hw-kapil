package java_week2_hw;

public class Programme3
{
    String name ="prime";
    static String surname="Testing";

    public void instanceMethod()
    {
        System.out.println(name);
        System.out.println(Programme3.surname);
    }

    public static void main(String[] args)
    {
     Programme3 p3 = new Programme3();
     p3.instanceMethod();
    }
}
