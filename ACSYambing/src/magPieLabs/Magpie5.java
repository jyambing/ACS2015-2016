package magPieLabs;

public class Magpie5 {
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "Hi, I'm Musical Maggie! Let's talk Music!";
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
			response = "Hey pal! You still there?";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative? Music is always a positve";
		}
		else if (findKeyword(statement, "One Direction") >= 0
				|| findKeyword(statement, "5 Seconds of Summer") >= 0
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
		else if( findKeyword(statement,"I like" ) >= 0)
		{
		response= transformILikeStatement(statement); 
		}
		else if( findKeyword(statement,"I hate" ) >= 0)
		{
		response= transformIHateStatement(statement); 
		}
		else if( findKeyword(statement,"I love" ) >= 0)
		{
		response= transformILoveStatement(statement); 
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	
	private String transformILikeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I like", 0);
		String restOfStatement = statement.substring(psn + 7).trim();
		return "What type of " + restOfStatement + " music do you like?";
	}

	private String transformIHateStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I hate", 0);
		String restOfStatement = statement.substring(psn + 7).trim();
		return "Why do you hate " + restOfStatement + " music?";
	}
	private String transformILoveStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I hate", 0);
		String restOfStatement = statement.substring(psn + 7).trim();
		return "It's awesome that you're passionate about " + restOfStatement +"!";
	}

	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) 
		{
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0)
			{
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
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
			response = "that's a bit questionable; not gonna lie";
		}
		else if (whichResponse == 7)
		{
			response = "i'm feeling some strong vibes";
		}
		else if (whichResponse == 8)
		{
			response = "so blessed";
		}
		return response;
	}

}