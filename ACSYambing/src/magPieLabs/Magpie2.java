package magPieLabs;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "What's good Pal? let's chat.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if(statement.trim().length()<1)
		{
			response= "Say something, I'm giving up on you";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your fam.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("rabbit") >= 0
				|| statement.indexOf("chinchilla") >= 0
				|| statement.indexOf("snake") >= 0
				|| statement.indexOf("alpaca") >= 0
				|| statement.indexOf("hamster") >= 0
				|| statement.indexOf("chicken") >= 0
				|| statement.indexOf("platypus") >= 0)
		{
			response = "Don't they poop a lot! Tell me more about your pets.";
		}
		else if (statement.indexOf("One Direction") >= 0
				|| statement.indexOf("5 Seconds oF Summer") >= 0
				|| statement.indexOf("Ed Sheeran") >= 0
				|| statement.indexOf("Halsey") >= 0
				|| statement.indexOf("The Weeknd") >= 0
				|| statement.indexOf("Jason Derulo") >= 0
				|| statement.indexOf("Walk the Moon") >= 0
				|| statement.indexOf("Taylor Swift") >= 0
				|| statement.indexOf("Bastille") >= 0
				|| statement.indexOf("Echosmith") >= 0)
		{
			response = "SO WOKE! Tell me more about this music!";
		}
		else if (statement.indexOf("Dr. R") >= 0
				|| statement.indexOf("Bfend") >= 0
				|| statement.indexOf("Heather Bender") >= 0
				|| statement.indexOf("Mrs. Wu") >= 0
				|| statement.indexOf("Liz Erikson") >= 0
				|| statement.indexOf("Mr. Albaugh") >= 0
				|| statement.indexOf("Roger") >= 0
				|| statement.indexOf("Momma J") >= 0
				|| statement.indexOf("Jill Rustad") >= 0
				|| statement.indexOf("KimmyD") >= 0)
		{
			response = "Aren't they an awesome teacher! Tell me more about them!";
		}
		else if (statement.indexOf("sports") >= 0
				|| statement.indexOf("basketball") >= 0
				|| statement.indexOf("basebal") >= 0
				|| statement.indexOf("volleyball") >= 0
				|| statement.indexOf("soccer") >= 0
				|| statement.indexOf("hockey") >= 0
				|| statement.indexOf("softball") >= 0
				|| statement.indexOf("swimming") >= 0
				|| statement.indexOf("golf") >= 0
				|| statement.indexOf("water polo") >= 0)
		{
			response = "ball is life. what's new?";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 9;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Wow, amazing!";
		}
		else if (whichResponse == 5)
		{
			response = "lol okay homie!!!";
		}
		else if (whichResponse == 6)
		{
			response = "ummm are you sure fam???";
		}
		else if (whichResponse == 7)
		{
			response = "that's personal... let's talk about something else";
		}
		else if (whichResponse == 8)
		{
			response = "so blessed";
		}
		return response;
	}
}


