package test123;

public class AcController {
	int id;
	double temp;
	Observable obs;

	AcController(int Id, double temp, Observable obj) {
		this.id = id;
		this.temp = temp;
		this.obs = obj;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getTemp() {
		return this.temp;
	}

	public void setState(String command) {
		double roomTemp = obs.checkTemp();

		if (roomTemp <= 18) {
			System.out.println("Current state is : OFF");

		} else if (roomTemp >= 30) {
			System.out.println("Current state is : ON");
		}

	}

}
