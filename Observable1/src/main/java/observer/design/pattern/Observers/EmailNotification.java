package observer.design.pattern.Observers;

import observer.design.pattern.Observables.StocksObservable;

public class EmailNotification implements NotificationAlertObserver{
    String email;
    StocksObservable obj;

    public EmailNotification(String e, StocksObservable o){
        this.email = e;
        this.obj = o;
    }

    @Override
    public void update() {
        sendEmail(obj.getData());
    }

    public void sendEmail(int data){
        System.out.println(data + " sent to email " + this.email);
    }
}
