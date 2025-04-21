package day3;
class phones{
	String colour;
	String model;
	int Displaysize;
	int Ram;
	int weight;
void playstore() {
	System.out.println("playstore is avilable");
}
void calender() {
	System.out.println("calaner is avilable");
}
void Notes() {
	System.out.println("Notes is avilable");
}
void Alaram() {
	System.out.println("Alaram is avilable");
}
	
}
class Samsung extends phones{
	String version;
	void samsunghelth() {
		System.out.println("samsung health app is avilable");
	}
	void Spen() {
		System.out.println("S pen is used in the phone");
	}
}

public class inheriteneconcept {
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.colour="white";
		s.Displaysize=12;
		s.model="s24ultra";
		s.Ram=8;
		s.version="18.v5";
		s.weight=300;
		System.out.println("c");
	}

}
