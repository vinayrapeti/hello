package day3;
class student{
	private String rollnumber;
	private String stdname;
	private String stdemail;
	private String stdpassword;
	public void setrollnumbers(String rollnumer) {
		this.rollnumber=rollnumer;
	}
	
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdemail() {
		return stdemail;
	}
	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}
	public String getStdpassword() {
		return stdpassword;
	}
	public void setStdpassword(String stdpassword) {
		this.stdpassword = stdpassword;
		
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public student(String rollnumber, String stdname, String stdemail, String stdpassword) {
		super();
		this.rollnumber = rollnumber;
		this.stdname = stdname;
		this.stdemail = stdemail;
		this.stdpassword = stdpassword;
	}
	
}
public class encapulationconcept {
	public static void main(String[] args) {
		student s = new student();
		s.setRollnumber("88");
		System.out.println(s.getRollnumber());
	}
	

}
