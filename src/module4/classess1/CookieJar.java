package module4.classess1;

public class CookieJar {
	
	private int size, amount;
	
	public CookieJar(int size) {
		this.size = size;
		this.amount = 0;
	}
	
	public int addStuff(int amount) {
		this.amount += amount;
		if (this.amount > size) {
			int temp = this.amount - size;
			this.amount = size;
			return temp;
		}
		return 0;
	}
	
	public int spaceLeft() {
		return size - amount;
	}
	
	public Boolean isFull() {
		if(amount == size) {
			return true;
		}
		return false;
	}
	
}