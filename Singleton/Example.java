public class Example {
    public static void main(String[]args)
    {
        System.out.println("create instance sg1");
        Singleton sg1=Singleton.getInstance();
        System.out.println("create instance sg2");
        Singleton sg2=Singleton.getInstance();
        if(sg1==sg2)
        System.out.println("sg1==sg2");
    }
}