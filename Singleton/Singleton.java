public class Singleton {
    static Singleton instance;
    private Singleton()
    {
        System.out.println("Singleton instance created");
    }
    static Singleton getInstance(){
        if(instance == null)
        instance=new Singleton();
        return instance;
    }
}