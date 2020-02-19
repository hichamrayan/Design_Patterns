public class Example{
public static void main(String[] args){
    WindowsFactory windows=new WindowsFactory();
    LinuxFactory linux=new LinuxFactory();
    
    System.out.println(windows.getClass().getName()+" creates "+windows.getProductA().getClass().getName());
    System.out.println(windows.getClass().getName()+" creates "+windows.getProductB().getClass().getName());
    System.out.println(linux.getClass().getName()+" creates "+linux.getProductA().getClass().getName());
    System.out.println(linux.getClass().getName()+" creates "+linux.getProductB().getClass().getName());
}
}