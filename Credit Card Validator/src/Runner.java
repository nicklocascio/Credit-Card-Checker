import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Runner
	{
	static int counter = 0;
	
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("nums.txt"));
		long correct = 5424180123456789L;
		long incorrect = 5424180123456788L;
		
		// Going through numbers
		for(int i = 0; i < 100; i++)
			{
			long num = file.nextLong();	
			ArrayList <Long> strippedNums = new ArrayList <Long>();
			// Individual Number
			for(int j = 0; j < 16; j++)
				{
				// Stripping
				long digit = num%10;
				strippedNums.add(digit);
				num = num/10;
				}
			// Going through the stripped digits for replacement
			for(int k = 1; k < strippedNums.size(); k+=2)
				{
				// Doubling every other
				long replacement = strippedNums.get(k) * 2;
				// Double Digits
				if(replacement > 9)
					{
					//System.out.println(replacement);
					ArrayList <Long> small = new ArrayList <Long>();
					// Strip Dub Digs
					for(int l = 0; l < 2; l++)
						{
						long digit2 = replacement%10;
						small.add(digit2);
						replacement = replacement/10;
						}
					// Add Digs
					long replacement2 = small.get(0) + small.get(1);
					//System.out.println(replacement2);
					// Replace Dub Digs
					strippedNums.set(k, replacement2);
					}
				// Single Digit Replacement
				else if(replacement <=9)
					{
					strippedNums.set(k, replacement);
					}
				}
			// Sum up each number
			long sum = 0;
			for(int p = 0; p < strippedNums.size(); p++)
				{
				sum = sum + strippedNums.get(p);	
				} 
			// Checking for divisible by ten for validity 
			if(sum%10 == 0)
				{
				counter++;	
				}
			}
		if(counter == 1)
			{
			System.out.println("There is " + counter + " valid credit card number.");
			}
		else if(counter > 1 || counter == 0)
			{
			System.out.println("There are " + counter + " valid credit card numbers.");
			}
		}
	}





