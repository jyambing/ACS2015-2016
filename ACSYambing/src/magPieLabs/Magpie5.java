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
		else if (findKeyword(statement, "band")>=0)
		{
			response = "What instrument do you play?";
		}
		else if (findKeyword(statement, "choir")>=0)
		{
			response = "What voice part do you sing?";
		}
	
		else if(findKeyword(statement, "pop")>=0)
				{ response= getRandomPop();
				}
		else if( findKeyword(statement, "classical")>=0)
				{ response= getRandomClassical();
				}
		else if(findKeyword(statement, "rap")>=0)
		{ response= getRandomRap();
		}
		else if( findKeyword(statement, "country")>=0)
		{ response= getRandomCountry();
		}
		else if(findKeyword(statement, "rock")>=0)
		{ response= getRandomRock();
		}
		else if(findKeyword(statement, "oldies")>=0)
		{ response= getRandomOldies();
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
	private String getRandomPop()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "One Direction";
		}
		else if (whichResponse == 1)
		{
			response = "Bruno Mars";
		}
		else if (whichResponse == 2)
		{
			response = "Taylor Swift";
		}
		else if (whichResponse == 3)
		{
			response = "Jason Derulo";
		}
		return response;
	}
	private String getRandomClassical()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Yo Yo Ma";
		}
		else if (whichResponse == 1)
		{
			response = "Beethoven";
		}
		else if (whichResponse == 2)
		{
			response = "Mozart";
		}
		else if (whichResponse == 3)
		{
			response = "Bach";
		}
		return response;
	}
	private String getRandomRap()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Hoodie Allen";
		}
		else if (whichResponse == 1)
		{
			response = "Kanye West";
		}
		else if (whichResponse == 2)
		{
			response = "Drake";
		}
		else if (whichResponse == 3)
		{
			response = "Nikki Minaj";
		}
		return response;
	}
	private String getRandomCountry()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Sugarland";
		}
		else if (whichResponse == 1)
		{
			response = "Tim McGraw";
		}
		else if (whichResponse == 2)
		{
			response = "Keith Urban";
		}
		else if (whichResponse == 3)
		{
			response = "Miranda Lambert";
		}
		return response;
	}
	private String getRandomRock()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Livin' on a Prayer";
		}
		else if (whichResponse == 1)
		{
			response = "Eye of the Tiger";
		}
		else if (whichResponse == 2)
		{
			response = "Green Day";
		}
		else if (whichResponse == 3)
		{
			response = "Imagine Dragons";
		}
		return response;
	}
	private String getRandomOldies()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "I Want it that Way";
		}
		else if (whichResponse == 1)
		{
			response = "Bohemian Rhapsody";
		}
		else if (whichResponse == 2)
		{
			response = "Woudn't it be Nice";
		}
		else if (whichResponse == 3)
		{
			response = "Oh, What a night";
		}
		return response;
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