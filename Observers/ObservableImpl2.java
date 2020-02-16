import java.util.HashSet;
public class ObservableImpl2 implements IObservable {
    HashSet<IObserver> observers=new HashSet<IObserver>();
    @Override
    public void register(IObserver o){
     observers.add(o);
    }
        @Override
        public void unregister(IObserver o){
            observers.remove(o);
    }
        @Override
        public void notifyObservers(){
        for(IObserver o:observers)
        {
            o.update(this);
        }
    }
}