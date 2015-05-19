import java.util.Scanner;

public class DayofWeek
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new day of the week:/n");
		String day = scanner.next();
		System.out.println("I read this day of week " + day);
		
		DayofWeek dayofWeekEvaluator = new DayofWeek();
		dayofWeekEvaluator.EvaluateDayofWeek(day);
		
		scanner.close();
	}
	
	void EvaluateDayofWeek(String dayofWeek)
	{
		if (dayofWeek != null)
		{
			if (dayofWeek.equalsIgnoreCase("Saturday")
			||dayofWeek.equalsIgnoreCase("Sunday"))
			{
				System.out.println(dayofWeek + " is the weekend!!!");
			}
			else if (dayofWeek.equalsIgnoreCase("Monday")
					||dayofWeek.equalsIgnoreCase("Tuesday")
					||dayofWeek.equalsIgnoreCase("Wednesday")
					 ||dayofWeek.equalsIgnoreCase("Thursday")
					 ||dayofWeek.equalsIgnoreCase("Friday"))
				{
				  System.out.println(dayofWeek + " is a weekday, I have to go to work");
				}
			else 
			{
				  System.out.println(dayofWeek + " is not even a valid day!!!");
			}
		}
	
		
}
}
