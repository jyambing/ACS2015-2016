package magPieLabs;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
 
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int pos = sample.indexOf("slow");
		if(pos != -1)
		   System.out.println("The word 'slow' is found at position " + pos);
		else
		   System.out.println("the word 'slow' is not found");

String test1 = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
	int occur=0;
if(test1.indexOf("the", 0)!=-1)
for(int x= 0; x<test1.length()-3; x++)
{ if(test1.substring(x, x+3).equals("the"))
	occur++;
}
System.out.println("The word 'the' occurs " + occur + " times.");
}
}

