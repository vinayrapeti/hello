package com.generics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	 String Student_name;
	 int Student_id;
	public Student(int Student_id, String Student_name) {
		this.Student_id = Student_id;
		this.Student_name = Student_name;
	}
}
public class obj_input_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student(23, "vinay");
		try {
			ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("index.html"));
			o.writeObject(std);
			System.out.println("data is inserted");
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ObjectOutputStream oi = new ObjectOutputStream (new FileOutputStream("index.html"));
			Student s1 =(Student) oi.readObject();
			System.out.println(s1.Student_id +""+ s1.Student_name);
			oi.close();
		}catch (Exception e) {
			
			
		}

	}

}
