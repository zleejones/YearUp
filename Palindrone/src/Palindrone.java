
public class Palindrone {

	public static void main(String[] args) 
	{
		String string1 = "go dog";
		String string2 = "Cat";
		
		boolean isString1Palindrone = IsPalindrone(string1);
		boolean isString2Palindrone = IsPalindrone(string2);
		
		if (isString1Palindrone)
		{
			System.out.println(string1 + "  is a palindrone.");
		}
		else
		{
			System.out.println(string1 + " is not a palindrone");
		}
		
		if (isString2Palindrone)
		{
			System.out.println(string2 + " is a palindrone");
		}
		else
		{
			System.out.println(string2 + " is not a palindrone");
		}

	}

	public static boolean IsPalindrone(String wordInput)
	{
		boolean isPalindrone = true;
		
		if (wordInput != null)
		{
			String wordInputNoSpaceAndLowerCase = wordInput.replace(" ", "").toLowerCase();
			char[] wordInputChars = wordInputNoSpaceAndLowerCase.toCharArray();
			
			for (int i = 0, k = wordInputChars.length - 1; i < wordInputChars.length/2; i++, k--)
			{
				if (wordInputChars[i] != wordInputChars[k])
				{
					isPalindrone = false;
					break;
					
				}
			}
		}
		else
		{
			System.out.println(" You gave me a null string :( ");
		}
		
		return isPalindrone;
	}
}
