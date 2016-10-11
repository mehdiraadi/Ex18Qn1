import java.text.DecimalFormat;

public class Student extends Person{
	private double firstGrade=0.0;
	private double secondGrade=0.0;
	private double thirdGrade=0.0;
	private double averageGrade;
	public Student(int age, String firstName, String lastName, char gender) {
		super(age, firstName,lastName , gender);
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String firstName, String lastName, char gender, double firstGrade,
			double secondGrade,
			double thirdGrade, double averageGrade) {
		super(age, firstName, lastName, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}
	public double getFirstGrade() {
		return firstGrade;
	}
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}
	public double getSecondGrade() {
		return secondGrade;
	}
	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}
	public double getThirdGrade() {
		return thirdGrade;
	}
	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	public double calculateAverage(){
		double averageGrade=(this.firstGrade+this.secondGrade+this.thirdGrade)/3.0;
		 this.setAverageGrade(averageGrade);
		 return averageGrade;
	}
		
		
	
	//public double calculateAverage(){
		//double sum = this.firstGrade +this.secondGrade +this.thirdGrade;
		//double average = sum /3;
		//this.setAverageGrade(average);
		//return average;

	public double calculateAverage(double firstGrade, double secondGrade, double thirdGrade){
		 double avarageGrade=(firstGrade+secondGrade+thirdGrade)/3.0;
		 this.setAverageGrade(avarageGrade);
		 return averageGrade;
		
	}
	    boolean clear;
	public boolean hasClearedTheCourse(){
		if(averageGrade<6.0){
			clear=false;
			return clear;
		}
		else {
			clear=true;
			return clear;
		}
		
	}
	@Override
	public String toString() {
		calculateAverage(this.getFirstGrade(),getSecondGrade(),getThirdGrade());
		DecimalFormat df=new DecimalFormat("#.0");
		if(hasClearedTheCourse()){
			return "Student: "+getFirstName()+" "+getLastName()+"\n"+"Grades: "+
		this.firstGrade+","+this.secondGrade+","+this.thirdGrade+"\nfinalGrade: "
		+df.format(this.averageGrade)+"\nThe student has cleared the course\n------------------";
		}
		return "Student: "+getFirstName()+" "+getLastName()+"\n"+"Grades: "+
		this.firstGrade+","+this.secondGrade+","
		+this.thirdGrade+"\nfinalGrade: "+df.format(this.averageGrade)+
		"\nThe student has not cleared the course\n------------------";
}
	

}


