package observer.design.pattern;

import observer.design.pattern.Observables.PhoneObservableImpl;
import observer.design.pattern.Observables.StocksObservable;
import observer.design.pattern.Observers.EmailNotification;
import observer.design.pattern.Observers.NotificationAlertObserver;
import observer.design.pattern.Observers.SMSNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StocksObservable phoneStock = new PhoneObservableImpl();
        NotificationAlertObserver obs1 = new EmailNotification("dkjbHJDhjFB", phoneStock);
        NotificationAlertObserver obs2 = new EmailNotification("dkjbHJDhjFBfdbjvej", phoneStock);
        NotificationAlertObserver obs3 = new SMSNotification("ABCDE", phoneStock);

        phoneStock.add(obs1);
        phoneStock.add(obs2);
        phoneStock.add(obs3);
        phoneStock.setData(100);
        phoneStock.setData(0);
        phoneStock.setData(40);

    }
}