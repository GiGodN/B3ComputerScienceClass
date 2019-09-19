package module1.ClassLabs;

public class Dog {
	
	private int age;
	private String name;

	public Dog(String n) {
		age = 1;
		name = n;
	}

	public Dog(String n, int a) {
		age = a;
		name = n;
	}

	public void increaseAgeByOne() {
		age++;
	}

	public int getPeopleAge(int val) {
		int temp = age * val;
		return temp;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Dog - " + name + " " + age;
	}
}
