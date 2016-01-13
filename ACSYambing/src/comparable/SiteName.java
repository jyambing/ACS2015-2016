package comparable;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	//add instance variables
	private String origSite;
	private String name;
	private String end;
	
	//add a constructor
public SiteName (String siteName)
{
	origSite= siteName;
	String[] webSite = siteName.split("\\.");
	name = webSite[0];
	end= webSite[1];
	
}

	//add a compareTo
public int compareTo(SiteName other)
{
	if(this.end.compareTo(other.end)!=0)
		return this.end.compareTo(other.end);
	else 
		return this.name.compareTo(other.name);
}

	//add a toString
public String toString()
{
	return origSite;
}
}
