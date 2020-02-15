import java.util.ArrayList;
public class ObservableImpl2 implements IObservable {
   ArrayList<IObserver> observers=new ArrayList<IObserver>();;
    public void register(IObserver o){
     observers.add(o);
    }
        public void unregister(IObserver o){
            observers.remove(o);
    }
        public void notifyObservers(){
        for(IObserver o:observers)
        {
            o.update(this);
        }
    }
}