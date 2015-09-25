package lab04;
//© A+ Computer Science  -  www.apluscompsci.com
	//Name -
	//Date -
	//Class -
	//Lab  -

	import static java.lang.System.*;

	public class AddString
	{
	   private String first, last;
	   private String sum;

	   public AddString()
	   {
first=last=sum= "";

	   }

	   public AddString(String one, String two)
	   {
first = one;
last = two;
sum= one + " "+ two;
	   }

	   public void setStrings(String one, String two)
	   {
first =one;
last= two;

	   }

	 	public void add( )
	 	{
sum= first+ " " + last;

		}

	 	public String toString()
	 	{
	 		String output= sum;



	 		return output;
		}
	}

