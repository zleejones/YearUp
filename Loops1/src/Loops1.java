
public class Loops1 
{

	public static void main(String[] args)
	{
		int[] inputArray = {76, 90, 87, 90};
		SearchNumber(inputArray, 90);
	}
	public static void SearchNumber (int[] array, int number)
	{
		if (array != null)
		{
			if (array.length > 0)
			{
				for ( int i = 0; i < array.length; i++)
				{ 
					if (array[i] == number)
					{ 
						System.out.println("found " + number + " at location " + i + " in array");
						break;
					}
				}
				
			}
		}
	}		
	public static void SearchOccurences(int[] array, int number)
	{    
		int numberOfoccurences = 0;

		for(int i = 0; i < array.length; i++)
		{
			if (array[i] == number)
			{ 
				numberOfoccurences++;
			}
			{
				System.out.println("found" + number + "in array" + numberOfoccurences + "times");
			}
		}
	}

}