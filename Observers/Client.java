class Client {
public static void main(String args[])
{
    IObservable observable1=new ObservableImpl1();
    IObservable observable2=new ObservableImpl2();
    IObserver observer1=new ObserverImpl1();
    IObserver observer2=new ObserverImpl2();
    System.out.println("-- register observer1 with observable1");
    observable1.register(observer1);
    System.out.println("-- register observer2 with observable2");
    observable2.register(observer2);
    System.out.println("-- notifyObservers");
    observable1.notifyObservers();
    observable2.notifyObservers();
    System.out.println("-- register observer1 with observable2");
    observable2.register(observer1);
    System.out.println("-- notifyObservers");
    observable1.notifyObservers();
    observable2.notifyObservers();
    System.out.println("-- unregister observer1 from observable1");
    observable1.register(observer1);
    System.out.println("-- notifyObservers");
    observable1.notifyObservers();
    observable2.notifyObservers();
}

}