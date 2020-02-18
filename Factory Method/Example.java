public class Example{
    public static void main(String[]args)
    {
        Factory factory1=new ConcreteFactory1();
        Factory factory2=new ConcreteFactory2();
        System.out.println("=== create 10 concrete products using ConcreteFactory1 (A more than B)");
        for(int i=0;i<10;i++)
        System.out.println(factory1.create().getClass().getName());
        System.out.println("=== create 10 concrete products using ConcreteFactory2 (B more than A)");
        for(int i=0;i<10;i++)
        System.out.println(factory2.create().getClass().getName());
    }
}