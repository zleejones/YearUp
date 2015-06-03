
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversed = ReverseOutPlace("Zakir");
		
		System.out.println(reversed);
		
	}
    public static String ReverseInPlace(String originalString)
    {
    	String reversedString = null;
    	
    	if (originalString !=null)
    	{
    		char[] originalStringCharacters = originalString.toCharArray();
    		
    		for (int i = 0, j = originalStringCharacters.length - 1; i < originalStringCharacters.length/2; i++, j--)//
    		{	
    		    char temp = originalStringCharacters[j];//must make a temporary place holder to place H while replacing it with O
    		    originalStringCharacters[j] = originalStringCharacters[i];
    		    originalStringCharacters[i] = temp;//places the files from the temp back where they came
    		}
    		reversedString = new String(originalStringCharacters);
    	}
    	return reversedString;
    }
    public static String ReverseOutPlace(String originalString)
    {
    	String swapString = ""; 
    	
    	for (int i = originalString.length() - 1; i >= 0; i--) {
    		swapString += originalString.charAt(i);
    	}
    	
    	return swapString;
    }
}
