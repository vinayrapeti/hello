package day5;
interface vehicle{
	void start();
}
class bmw implements vehicle{
public void start() {
	System.out.println("car is starting");
}
}
public class interface1 {
public static void main(String[] args) {
	bmw g = new bmw();
	g.start();
}
}
