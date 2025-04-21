package day3;

class Dog {
	String colour;
	String bried;
	int age;
	int hight;
	Boolean gender;

	void eating() {
		System.out.println("A dog is Eating");
	}

	void barking() {
		System.out.println("dog is barking");
	}

	void sleeping() {
		System.out.println("dog is sleeping");
	}

	void running() {
		System.out.println("dog is running");
	}

	void drinking() {
		System.out.println("dog is drinking");
	}

}

public class day_3 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.colour="black";
		d.age=7;
		d.bried="husky";
		d.hight=4;
		d.gender=true;
		System.out.println("d.colour");
		System.out.println("d.age");
		System.out.println("d.bried");
		System.out.println("d.hieght");
		System.out.println("d.gender");
		d.eating();
		d.drinking();
		d.barking();
		d.sleeping();
		d.running();
		

	}

}
