package student;
class Student{
	private static int numStudents;
	private String studentName;
	private int studentGrade;
	private double studentGPA;
	public Student(){
		numStudents++;
	}
	public Student(String name, int grade){
		numStudents++;
		studentName=name;
		studentGrade=grade;
	}
	public Student(String name, int grade, double gpa){
		numStudents++;
		studentName=name;
		studentGrade=grade;
		studentGPA=gpa;
	}
	public String getName(){
		return studentName;
	}
	public int getNumStudents(){
		return numStudents;
	}
	public int getGrade(){
		return studentGrade;
	}
	public double getGPA(){
		return studentGPA;
	}
	public void setGrade(int grade){
		studentGrade=grade;
	}
	public void setGPA(double gpa){
		studentGPA=gpa;
	}
	public String toString(){
		return "The student "+studentName+" is in grade "+studentGrade+" with a GPA of "+studentGPA+".";
	}
}