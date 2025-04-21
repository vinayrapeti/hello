package com.generics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
class User{
	private String Name;
		public User(String name) {
		this.Name=Name;
	}
		public String Username() {
			return Name;
		}
}

public class Optional_db {
	static Map<Integer, User> mp = new HashMap<Integer,User>();
	static {
		mp.put(1, new User("vinay"));
		mp.put(2, new User("vivek"));
		
	}
	public static Optional<User> GetById(int id) {
		return Optional.ofNullable(mp.get(id));
		
	}
	
public static void main(String[] args) {
	int Srearch_id = 1;
	Optional<User> u1 = GetById(Srearch_id);
	String message = u1.map(u2 -> "User Found: " + u2.Username()).orElse("User Not Found");
	System.out.println(message);
	LocalTime LT = LocalTime.now();
	DateTimeFormatter dt = DateTimeFormatter.ofPattern("hh::mm::ss a");
	String str = LT.format(dt);
	System.out.println(str);
}
}
