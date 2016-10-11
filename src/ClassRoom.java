import java.util.ArrayList;

public class ClassRoom {
	
	private String classRoomName="Test automatisering";
	private String classRoomTerm="Spring";
	ArrayList<Student>students=new ArrayList<Student>();
	
	
	public ClassRoom(String classRoomName, String classRoomTerm, ArrayList<Student> students) {
		super();
		this.classRoomName = classRoomName;
		this.classRoomTerm = classRoomTerm;
		this.students = students;
	}
	public String getClassRoomName() {
		return classRoomName;
	}
	public void setClassRoomName(String classRoomName) {
		this.classRoomName = classRoomName;
	}
	public String getClassRoomTerm() {
		return classRoomTerm;
	}
	public void setClassRoomTerm(String classRoomTerm) {
		this.classRoomTerm = classRoomTerm;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addANewStudent(Student e){
		students.add(e);
		
	}
	public void removeAStudent(String firstName){
		/*if(students.contains(firstName)){
			System.out.println("Student "+ firstName +" is successfully removed");
		}
		else{
			System.out.println("The student doesn't exist");
		}*/
		Student student = null;
		boolean studentExists = false;
		for(int i= 0 ; i < this.students.size() ; i++){
			student = this.students.get(i);
			if (student.getFirstName().contains(firstName)){
				studentExists = true;
				this.students.remove(i);
				System.out.println("Student "+firstName+" successfully removed!");
			}
			
		}
		System.out.println("Student does not exist");
		
	}
	public void printFullRelatory(){
		System.out.println("testauto " + " spring "+ students);
		
	}
	
	

}
