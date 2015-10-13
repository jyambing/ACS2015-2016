package magPieLabs;

/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
 
public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
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
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "rabbit") >= 0
				|| findKeyword(statement, "chinchilla") >= 0
				|| findKeyword(statement, "snake") >= 0
				|| findKeyword(statement, "alpaca") >= 0
				|| findKeyword(statement, "hamster") >= 0
				|| findKeyword(statement, "chicken") >= 0
				|| findKeyword(statement, "platypus") >= 0)
		{
			response = "Don't they poop a lot! Tell me more about your pets.";
		}
		else if (findKeyword(statement, "One Direction") >= 0
				|| findKeyword(statement, "5 Seconds oF Summer") >= 0
				|| findKeyword(statement, "Ed Sheeran") >= 0
				|| findKeyword(statement, "Halsey") >= 0
				|| findKeyword(statement, "The Weeknd") >= 0
				|| findKeyword(statement, "Jason Derulo") >= 0
				|| findKeyword(statement, "Walk the Moon") >= 0
				|| findKeyword(statement, "Taylor Swift") >= 0
				|| findKeyword(statement, "Bastille") >= 0
				|| findKeyword(statement, "Echosmith") >= 0)
		{
			response = "SO WOKE! Tell me more about this music!";
		}
		else if (findKeyword(statement, "Dr. R") >= 0
				|| findKeyword(statement, "Bfend") >= 0
				|| findKeyword(statement, "Heather Bender") >= 0
				|| findKeyword(statement, "Mrs. Wu") >= 0
				|| findKeyword(statement, "Liz Erikson") >= 0
				|| findKeyword(statement, "Mr. Albaugh") >= 0
				|| findKeyword(statement, "Roger") >= 0
				|| findKeyword(statement, "Momma J") >= 0
				|| findKeyword(statement, "Jill Rustad") >= 0
				|| findKeyword(statement, "KimmyD") >= 0)
		{
			response = "Aren't they an awesome teacher! Tell me more about them!";
		}
		else if (findKeyword(statement, "sports") >= 0
				|| findKeyword(statement, "basketball") >= 0
				|| findKeyword(statement, "basebal") >= 0
				|| findKeyword(statement, "volleyball") >= 0
				|| findKeyword(statement, "soccer") >= 0
				|| findKeyword(statement, "hockey") >= 0
				|| findKeyword(statement, "softball") >= 0
				|| findKeyword(statement, "swimming") >= 0
				|| findKeyword(statement, "golf") >= 0
				|| findKeyword(statement, "water polo") >= 0)
		{
			response = "ball is life. what's new?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
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

		return response;
	}

}
