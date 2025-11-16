package observer.design.pattern.Observers;

import observer.design.pattern.Observables.StocksObservable;

public class SMSNotification implements NotificationAlertObserver{
    String username;
    StocksObservable obj;

    public SMSNotification(String name, StocksObservable o){
        this.username = name;
        this.obj = o;
    }

    @Override
    public void update() {
        sendSMS(obj.getData());
    }

    public void sendSMS(int data){
        System.out.println(data + " sent to this " + this.username);
    }
}
