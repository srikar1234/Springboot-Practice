package observer.design.pattern.Observables;

import observer.design.pattern.Observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneObservableImpl implements StocksObservable{
    public int stockCount = 0;
    List<NotificationAlertObserver> listOfObs = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver obj) {
        this.listOfObs.add(obj);
    }

    @Override
    public void delete(NotificationAlertObserver obj) {
        this.listOfObs.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver obs: this.listOfObs)
            obs.update();
    }

    @Override
    public int getData() {
        return this.stockCount;
    }

    @Override
    public void setData(int newStockCount) {
        if(this.stockCount == 0)
            notifyObservers();
        this.stockCount = newStockCount;
    }
}
