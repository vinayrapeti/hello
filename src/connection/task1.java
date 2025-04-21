package connection;

import java.util.Scanner;
import java.util.ArrayList;

class task {
	private String name;
	private int num;
	private int id;
	private String email;
	
public task() {
		super();
		// TODO Auto-generated constructor stub
	}

public task(String name, int num, int id, String email) {
		super();
		this.name = name;
		this.num = num;
		this.id = id;
		this.email = email;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
public class task1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<task> ar = new ArrayList<>();
		task ts = new task();
		System.out.println("enter the name");
		ts.setName(sc.next());
		ar.add(ts);
		System.out.println(ar);
		
	}
}