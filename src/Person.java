
public class Person {
	private int age=31;
	private String firstName="jasmi";
	private String lastName="Shaheer";
	private char gender='F';
	public Person(int age, String firstName, String lastName, char gender) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String LastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
