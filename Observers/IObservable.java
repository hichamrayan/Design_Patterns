interface IObservable {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers();
}