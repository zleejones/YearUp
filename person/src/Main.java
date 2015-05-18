
public class Main {

	public static void main(String[] args)
	{
		int age = 24;
		String address = "555 Monster Dr";
		String name = "Khalik";
		String phoneNumber = "770-908-7383";

		Person person1 = new Person(name, age,phoneNumber, address);

		System.out.println("This person lives at " + person1.GetAddress());
		System.out.println("This person is" + person1.GetAge() + " age");
		System.out.println("This person's name is " + person1.GetName());
		System.out.println("This person's phone number is " + person1.GetPhoneNumber());
	
	person1.GrowsOlder();

	System.out.println("new age: "+ person1.GetAge());
	}
}
