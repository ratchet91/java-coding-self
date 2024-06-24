package lowLevelDesign.Observer;

import lowLevelDesign.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
	String userName;
	StockObservable stockObservable;

	public MobileAlertObserver(String userId, StockObservable stockObservable) {
		this.userName = userId;
		this.stockObservable = stockObservable;
	}

	public void update() {
		sendMsgOnMobile(userName, "Product is in stock hurry up!!!");
	}

	public void sendMsgOnMobile(String userName, String msg) {
		System.out.println("msg sent to : " + userName);
	}
}
