package lowLevelDesign.Observer;

import lowLevelDesign.Observable.StockObservable;
import lowLevelDesign.Observable.StockObservableImpl;

public class Store {
	public static void main(String[] args) {

		StockObservable iphoneStockObservable = new StockObservableImpl();

		NotificationAlertObserver observer1 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserver("abc_username", iphoneStockObservable);

		iphoneStockObservable.add(observer3);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer1);

		iphoneStockObservable.setStockCount(10);
	}
}
