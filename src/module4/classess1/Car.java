package module4.classess1;

public class Car {
	
	private int miles, change, lastChange;
	
	public Car(int miles, int change) {
		this.miles = miles;
		this.change = change;
		this.lastChange = 0;
	}
	
	public Boolean timeForOilChange() {
		if(lastChange + change <= miles) {
			lastChange = miles;
			return true;
		}
		return false;
	}
	
	public void addMiles(int miles) {
		this.miles += miles;
	}
	
}