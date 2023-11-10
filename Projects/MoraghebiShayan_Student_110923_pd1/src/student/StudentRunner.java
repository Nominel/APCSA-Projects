package student;

public class StudentRunner {
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println(student1);
        Student student2 = new Student("John",12);
        System.out.println(student2);
        Student student3 = new Student("Hope", 11, 3.8);
        System.out.println(student3);
        Student student4 = new Student("Bob", 9);
        System.out.println(student4);
        Student student5 = new Student("Brock", 10, 3.4);
        System.out.println(student5);
        System.out.println("The total number of students is "+student1.getNumStudents()+".");
    }
}
