package queue;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14b
{
	public static void main ( String[] args )
	{
		PQTester one= new PQTester("one two three four five six seven");
		System.out.println(one);
		
		PQTester two= new PQTester("1 2 3 4 5 one two three four five");
		System.out.println(two);
		
		PQTester three= new PQTester("a p h j e f m c i d k l g n o b");
		System.out.println(three);	
	}
}