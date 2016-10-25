import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Runner
	{
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("nums.txt"));
//		ArrayList <Long> strippedNums = new ArrayList <Long>();
		long correct = 5424180123456789L;
		long incorrect = 5424180123456788L;
		
		for(int i = 0; i < 100; i++)
			{
			long num = file.nextLong();	
			ArrayList <Long> strippedNums = new ArrayList <Long>();
			for(int j = 0; j < 16; j++)
				{
				long digit = num%10;
				strippedNums.add(digit);
				num = num/10;			
				}
			}
		}
	}
