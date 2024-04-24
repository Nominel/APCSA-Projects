package One_AppointmentBook;

public class AppointmentBookRunner
{
	public static void main(String[] args) 
	{
		AppointmentBook x = new AppointmentBook();
		System.out.println(x);
		System.out.println(x.makeAppointment(1,8,20));
		System.out.println(x);
		System.out.println(x.makeAppointment(1,1,50));
		System.out.println(x);
		System.out.println(x.makeAppointment(5,8,20));
		System.out.println(x);
		System.out.println(x.makeAppointment(3,4,50));
		System.out.println(x);

	}
}
