package lowLevelDesign.Observer;

import lowLevelDesign.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
	String emailId;
	StockObservable stockObservable;

	public EmailAlertObserver(String emailId, StockObservable stockObservable) {
		this.emailId = emailId;
		this.stockObservable = stockObservable;
	}

	public void update() {
		sendMail(emailId, "product is in stock hurry up!!!");
	}

	public void sendMail(String emailId, String msg) {
		System.out.println("mail sent to : " + emailId);
		// send the actual email to the end user
	}

}
