package lowLevelDesign.Observable;

import java.util.ArrayList;
import java.util.List;

import lowLevelDesign.Observer.NotificationAlertObserver;

public class StockObservableImpl implements StockObservable {
	public List<NotificationAlertObserver> allObservers = new ArrayList<>();
	public int stockCount = 0;

	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		allObservers.add(observer);

	}

	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		allObservers.remove(observer);

	}

	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for (NotificationAlertObserver obj : allObservers) {
			obj.update();
		}

	}

	public void setStockCount(int newStockAdded) {
		// TODO Auto-generated method stub
		if (stockCount == 0) {
			notifySubscribers();
		}
		stockCount = stockCount + newStockAdded;

	}

	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
