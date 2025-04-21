package day4;

class instrument {
	String name;
	int length;

	void sound() {
		System.out.println("instrument plays sound");
	}
	String mia() {
		return "name";
	}
}
class guiter extends instrument {
	@Override
	void sound() {
		System.out.println("tring tring");
	}
	
public class program2 {
	public static void main(String[] args) {
		guiter g = new guiter();
		g.sound();
		

		}
	}
}
