package guiLabs;
//© A+ Computer Science  -  www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
 private String choice;
 
	public Computer()
	{
		randomSetChoice();
		//call random set Choice	
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		int c= (int) Math.random()*3;
		switch(c) {
		//use Math.random()
		case 0:
			choice= "paper";
		break;
		case 1: 
			choice="scissors";
		break;
		case 2:
			choice= "rock";
			break;
		}
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
	else if(p.getChoice().equals("paper")&&this.getChoice().equals("scissors")||p.getChoice().equals("scissors")&&this.getChoice().equals("rock")||p.getChoice().equals("rock")&&this.getChoice().equals("paper"))
		return 1;	
	else 
		return -1;
	}
	
	public String toString()
	{
		return choice;
	}		   
}