package java_week2_hw;

public class Programme4
{
    String name= "prime";
    String surname="Testing";
    static boolean a = true;
    static boolean b = false;
    public void instanceMethod()
    {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme4.a);
        System.out.println(Programme4.b);
    }
    public static void staticMethod()
    {
        Programme4 p4 = new Programme4();
        System.out.println(p4.name);
        System.out.println(p4.surname);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Programme4 p4 = new Programme4();
        p4.instanceMethod();
        staticMethod();
    }
}
