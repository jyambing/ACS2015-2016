package lab04;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04c
{
	public static void main ( String[] args )
	{
		StringRipper demo = new StringRipper("chicken");
		out.println(demo.ripString(3,6));
		out.println(demo);
		
		StringRipper democ =new StringRipper("alligator");
		out.println(democ.ripString(3,8));
		out.println(democ);		

		StringRipper demoa = new StringRipper("COMPUTER SCIENCE IS THE BEST!");
		out.println(demoa.ripString(9,12));
		out.println(demoa.ripString(0,12));
		out.println(demoa.ripString(5,20));				
		out.println(demoa);	

		StringRipper demob = new StringRipper("I like fried chicken and mashed potatoes!");
		out.println(demob.ripString(0,7));
		out.println(demob.ripString(7,15));
		out.println(demob.ripString(15,26));
		out.println(demob.ripString(22,26));						
		out.println(demob);		
	}
}