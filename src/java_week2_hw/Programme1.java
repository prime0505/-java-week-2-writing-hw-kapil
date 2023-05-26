package java_week2_hw;

public class Programme1
{
    int a=10;
    int b=20;
    public void instanceMethod()
    {
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args)
    {
        Programme1 p1 =new Programme1();
        p1.instanceMethod();

    }
}
