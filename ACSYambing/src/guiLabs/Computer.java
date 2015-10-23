package guiLabs;
//© A+ Computer Science  -  www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
 private String choice;
 
	public Computer()
	{
		choice.randomSetChoice();
		//call random set Choice	
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		int c= (int) Math.random()*3;
		//use Math.random()
		if(c==1)
			choice= "paper";
		else if (c==2)
			choice="scissors";
		else 
			choice= "rock";
		//use switch case
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{if(p.getChoice().equals(this.getChoice()))
		return 0;
	else if()
		return -1;		
	}
	
	public String toString()
	{
		return choice;
	}		   
}