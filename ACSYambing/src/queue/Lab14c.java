package queue;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Lab14c
{
	public static void main ( String[] args )
	{
		int h, w, a;
		int numMon=0;
		System.out.println("How many numbers do ou wish to enter? :: ");
		Scanner ent= new Scanner(System.in);
		numMon= ent.nextInt();
		MonsterPQ monsty= new MonsterPQ();
		while(numMon>0)
		{
			System.out.println("Enter the ht :: ");
			h= ent.nextInt();
			System.out.println("Enter the wt :: ");
			w= ent.nextInt();
			System.out.println("Enter the age :: ");
			a= ent.nextInt();
			Monster mons= new Monster(h, w, a);
			monsty.add(mons);
			numMon--;
		}
		System.out.println(monsty);
		System.out.println("getMin() - "+ monsty.getMin());
		System.out.println("removeMin() - "+ monsty.removeMin());
		System.out.println(monsty);
		//add test cases			
	}
}