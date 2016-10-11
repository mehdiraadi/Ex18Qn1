import java.util.ArrayList;

public class Main {
	public static void main(String[]args){
		
	
	ArrayList<Student>student=new ArrayList<Student>();
	ClassRoom cr=new ClassRoom("testauto", "spring", student);

	Student st1=new Student(28,"Jas1","SHR", 'F', 5.0,7.0,4.0, 0);
	Student st2=new Student(28,"Jas2","SHR2",'M', 7.0,7.0,6.0, 0);
	Student st3=new Student(28,"Jas3","SHR3",'f', 8.0,9.0,6.0, 0);
	Student st4=new Student(28,"Jas4","SHR4",'m', 3.0,3.0,2.0, 0);
	cr.addANewStudent(st1);
	cr.addANewStudent(st2);
	cr.addANewStudent(st3);
	cr.addANewStudent(st4);
	cr.removeAStudent("Jas3");
	cr.removeAStudent("Jasmi");
	cr.toString();
	cr.printFullRelatory();
	cr.removeAStudent("Jas4");
	

}
}
