import java.util.ArrayList;

public class Test
	{
	public static void main(String[] args)
		{
		long correct = 5424180123456789L;
		long incorrect = 5424180123456788L;	
		
		for(int i = 0; i < 2; i++)
			{
			ArrayList <Long> strippedNums = new ArrayList <Long>();
			for(int j = 0; j < 16; j++)
				{
				long digit = correct%10;
				strippedNums.add(digit);
				correct = correct/10;			
				}
			for(int k = 0; k < strippedNums.size(); k++)
				{
				if(k%2 == 0)
					{
					long doubled = strippedNums.get(k)*2;
					}
				}
			}
		}
	}
