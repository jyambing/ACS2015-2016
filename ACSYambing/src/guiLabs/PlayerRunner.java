package guiLabs;
//© A+ Computer Science  -  www.apluscompsci.com

//Player Runner 

public class PlayerRunner
{
	public static void main(String[] args)
	{
		Player s = new Player("Michael Jackson", "rock");

		System.out.println(s.getChoice());			//outs rock
		System.out.println(s.getName());//call the getName() method 					//outs Michael Jackson
		System.out.println(s);								//outs Michael Jackson rock
		
		s.setChoice("paper");//set the choice to paper
		System.out.println(s);								//outs Michael Jackson paper	
		
		Player jb= new Player("Jim Bob", "scissors");
		System.out.println(jb);
		//instantiate a new Player named jb named Jim Bob that chose scissors
		//print out Jim Bob	
	}
}
