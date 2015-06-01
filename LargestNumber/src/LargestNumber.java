
public class LargestNumber
{

	public static void main(String[] args)
	{
		int[] array1 = {1, 5, 6};
		int[] array2  = {};
		int[] array3 = null;
		LargestNumberUsingForLoop(array1);
		LargestNumberUsingForLoop(array2);
		LargestNumberUsingForLoop(array3);

		LargestNumberUsingWhileLoop(array1);
		LargestNumberUsingWhileLoop(array2);
		LargestNumberUsingWhileLoop(array3);

	}
	
	public static void LargestNumberUsingWhileLoop(int[] inputArray)
	{
		if (inputArray != null)
		{
			if (inputArray.length > 0)
			{
				int largestNumber = inputArray[0];
				int i = 0;
				
				while (i < inputArray.length)
					{
					  if (largestNumber < inputArray[i])	
					  {
						  largestNumber = inputArray[i];
					  }
					  
					  i++;
				  }
	
			System.out.println(" The largest number I found is:" + largestNumber);
			}
		else
		{
			System.out.println(" This array does not even have any numbers.");
		}
	}
		else
		{
			System.out.println(" You gave me a null array");
		}
	}
	public static void LargestNumberUsingForLoop(int[] inputArray)
	{
		if (inputArray != null)
		{
			if (inputArray.length > 0)
			{
				int largestNumber = inputArray[0];
				
				for (int i = 0;i < inputArray.length; i++)
				{
					if (largestNumber < inputArray[i])
					{
						largestNumber = inputArray[i];
					}
				}
				System.out.println(" The largest number I found is:" + largestNumber);
				
			}
			else
			{
				System.out.println(" This array does not even have any numbers.");
			}
		}
			else
			{
				System.out.println(" You gave me a null array");
			}
	}

}

