import java.io.BufferedReader;


public class FileIO {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Read();
	}
	
	public static void Read()
	{
		FileReader fileReader = null;
		
		try
		{
			fileReader = new FileReader("C:\\users\\zleejones\\Sandbox\\Java\\YearUp\\FileIO\\OOP_week15.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String changeWord = bufferedReader.readLine();
			StringBuilder builder = new StringBuilder();
			
			while(changeWord != null)
			{
				changeWord.replace("dolor", "hedon");
			}
	}
}
}

import java.io.*;

public class FileIO 
{
	public static void main(String[] args) 
	{
		try
		{
		String filePath = "C:\\Users\\Taha\\Documents\\YearUp\\Programming - Java\\OOP_weekk15.txt";
		String iReadThis = Read(filePath);
		String originalWord = "dolor";
		String replaceWord = "hedon";
		String replacedString = Replace(iReadThis, originalWord, replaceWord);
		Write(replacedString, filePath);
		}
		catch (IOException ex1)
		{
			System.out.println("Something went wront while reading or writing from the file!");
			ex1.printStackTrace();
		}
		catch (NullPointerException ex2)
		{
			System.out.println("You did not supply a valid supply path!");
			ex2.printStackTrace();
		}
	}
	
	private static void Write(String replacedString, String filePath) throws IOException
	{
		FileWriter writer = null;
		try
		{
			writer = new FileWriter(filePath);
			writer.write(replacedString);
		}
		finally
		{
			if (writer != null)
			{
				writer.close();
			}
		}
	}

	private static String Replace(String stringToBeReplaced, String originalWord, String replaceWord) 
	{
		String replacedString = null;
		
		if (stringToBeReplaced != null)
		{
			replacedString = stringToBeReplaced.replace(originalWord, replaceWord);
		}
		return replacedString;
	}

	public static String Read(String filePath) throws NullPointerException, IOException, FileNotFoundException
	{
		FileReader fileReader = null;
		String fullFile = null;
		BufferedReader bufferedReader = null;
		
		try
		{
			if(filePath == null)
			{
				throw new NullPointerException();
			}
			
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			StringBuilder builder = new StringBuilder();
			
			String iReadThis = bufferedReader.readLine();
			
			while(iReadThis != null)
			{
				builder.append(iReadThis);
				iReadThis = bufferedReader.readLine();
			}
			
			fullFile = builder.toString();
		}
		finally
		{
			if (fileReader != null)
			{
				fileReader.close();
			}
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}
		return fullFile;
	}
}
