package day6;

class student {
	private static String message = "hello";

	class Action {
		void dispaly() {
			System.out.println(message);
		}
	}
}

public class day6 {
	public static void main(String[] args) {
		student S = new student();
		student.Action A = S.new Action();
		A.dispaly();
	}
}
