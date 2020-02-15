public class ObserverImpl2 implements IObserver
{
    public void update(IObservable obs)
    {
        System.out.println(this.getClass().getName()+" update() called by "+obs.getClass().getName());
    }
}