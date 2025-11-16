package observer.design.pattern.Observables;

import observer.design.pattern.Observers.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver obj);
    public void delete(NotificationAlertObserver obj);
    public void notifyObservers();
    public int getData();
    public void setData(int stockCount);
}
