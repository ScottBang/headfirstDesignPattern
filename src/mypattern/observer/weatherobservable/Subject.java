package mypattern.observer.weatherobservable;

public interface Subject {
    public void registerObserver(Observer obj);
    public void removeObserver(Observer obj);
    public void notifyObservers();
}
