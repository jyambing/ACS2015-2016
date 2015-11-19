package Tri1Project;

import javax.sound.sampled.Clip;

public class Jukebox {
Music playMusic= new Music();

public String getResponse(String statement){
String response= "";
if(statement.equals("pop"))
{ response= playMusic.pop();
}
else if( statement.equals("instrumental"))
{ response= playMusic.instrumental();
}
else if(statement.equals("rap"))
{ response= playMusic.rap();
}
else if( statement.equals("country"))
{ response= playMusic.country();
}
else if(statement.equals("rock"))
{ response= playMusic.rock();
}
else response= playMusic.oldies();

return response;
}


}