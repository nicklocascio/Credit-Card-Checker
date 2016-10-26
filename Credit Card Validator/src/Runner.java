import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Runner
	{
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("nums.txt"));
//		ArrayList <Long> strippedNums = new ArrayList <Long>();
		long correct = 5424180123456789L;
		long incorrect = 5424180123456788L;
		
		// Going through numbers
		for(int i = 0; i < 1; i++)
			{
			//long num = file.nextLong();	
			ArrayList <Long> strippedNums = new ArrayList <Long>();
			// Individual Number
			for(int j = 0; j < 16; j++)
				{
				// Stripping
				long digit = correct%10;
				strippedNums.add(digit);
				correct = correct/10;			
//				Collections.reverse(strippedNums);
				System.out.println(correct);
				for(long ay : strippedNums)
					{
					System.out.println(ay);
					}
				
				// Going through stripped digits
				for(int k = 0; k < strippedNums.size(); k+=2)
					{
					// Replacing every other 
//					if(k%2 != 0)
//						{
						long replacement = strippedNums.get(k)*2;
						// If two digit number
						if(replacement > 9)
							{
							ArrayList <Long> small = new ArrayList <Long>();
							for(int l = 0; l < 2; l++)
								{							
								long replacement2 = replacement%10;
								small.add(replacement2);
								replacement = replacement/10;
								}
							long replacement3 = small.get(0) + small.get(1);
							strippedNums.set(k, replacement3);
							}
						// Not two digit number
						else if(replacement <= 9)
							{
							strippedNums.set(k, replacement);
							}
//						}
					// Not every other
//					else
//						{
//						
//						}
					}
				}
			for(long hi : strippedNums)
				{
				System.out.println(hi);
				}
			}
		}
	}
