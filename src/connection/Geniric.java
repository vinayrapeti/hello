package connection;
class products{
	private String Brand;
	public void pack(String Brand) {
		this.Brand=Brand;
	}
	public String unpack() {
		return Brand;
	}
}
class Bag extends products{
	public String toString() {
		return "fogg";
	}
	
}
public class Geniric {
	public static void main(String[] args) {
		Bag b = new Bag();
		products.pack(new Bag());
		System.out.println(b.unpack());
	}

}