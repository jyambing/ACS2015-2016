package Tri1Project;
import java.applet.AudioClip;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

   	public class LoadAudioAndPlay extends JApplet
   	{
     private AudioClip sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12, sound13, sound14, sound15, sound16, sound17, sound18, currentSound;
     private JButton playJButton, loopJButton, stopJButton;
     private JComboBox soundJComboBox;
  
       // load the image when the applet begins executing
      public void init()
     {
         setLayout( new FlowLayout() );
   
        String choices[] = { "Please select a type of music:", "Pop", "Instrumental","Rap/Hip Hop","Country","Rock","Oldies"  };
         soundJComboBox = new JComboBox( choices ); // create JComboBox
   
        soundJComboBox.addItemListener(
  
            new ItemListener() // anonymous inner class
            {
               // stop sound and change to sound to user's selection
               public void itemStateChanged( ItemEvent e )
               {
                 currentSound.stop();
                 if(soundJComboBox.getSelectedIndex() == 1) 
                    currentSound= getPop();
                 if(soundJComboBox.getSelectedIndex() == 2) 
                     currentSound= getInstrumental();
                 if(soundJComboBox.getSelectedIndex() == 3) 
                     currentSound= getRap();
                 if(soundJComboBox.getSelectedIndex() == 4) 
                     currentSound= getCountry();
                 if(soundJComboBox.getSelectedIndex() == 5) 
                     currentSound= getRock();
                 else if(soundJComboBox.getSelectedIndex() == 6)
                     currentSound= getOldies();
                  } // end method itemStateChanged
              } // end anonymous inner class
           ); // end addItemListener method call
  
            add( soundJComboBox ); // add JComboBox to applet
   
             // set up button event handler and buttons
           ButtonHandler handler = new ButtonHandler();
   
           // create Play JButton
            playJButton = new JButton( "Play" );
            playJButton.addActionListener( handler );
            add( playJButton );
   
           // create Loop JButton
            loopJButton = new JButton( "Loop" );
            loopJButton.addActionListener( handler );
           add( loopJButton );
   
            // create Stop JButton
            stopJButton = new JButton( "Stop" );
            stopJButton.addActionListener( handler );
            add( stopJButton );
   
             // load sounds and set currentSound
          

        
           sound1 = getAudioClip( getDocumentBase(), "wmyb.wav" );            
           sound2 = getAudioClip( getDocumentBase(), "gameThrones.wav" );
           sound3 = getAudioClip( getDocumentBase(), "23.wav" );
           sound4 = getAudioClip( getDocumentBase(), "dirt.wav" );
           sound5 = getAudioClip( getDocumentBase(), "acdc.wav" );
           sound6 = getAudioClip( getDocumentBase(), "dsb.wav" );
           sound7 = getAudioClip( getDocumentBase(), "shake.wav" );
           sound8 = getAudioClip( getDocumentBase(), "sorry.wav" );
           sound9 = getAudioClip( getDocumentBase(), "jack.wav" );
           sound10 = getAudioClip( getDocumentBase(), "skyfall.wav" );
           sound11 = getAudioClip( getDocumentBase(), "711.wav" );
           sound12 = getAudioClip( getDocumentBase(), "flo.wav" );
           sound13 = getAudioClip( getDocumentBase(), "home.wav" );
           sound14 = getAudioClip( getDocumentBase(), "shotgun.wav" );
           sound15 = getAudioClip( getDocumentBase(), "american.wav" );
           sound16 = getAudioClip( getDocumentBase(), "wmaa.wav" );
           sound17 = getAudioClip( getDocumentBase(), "queen.wav" );
           sound18 = getAudioClip( getDocumentBase(), "train.wav" );
           currentSound = sound1;
        } // end method init
   
          // stop the sound when the user switches Web pages
         public void stop()
  	{
           currentSound.stop(); // stop AudioClip
        } // end method stop
  
          // private inner class to handle button events
        private class ButtonHandler implements ActionListener
        {
            // process play, loop and stop button events
           public void actionPerformed( ActionEvent actionEvent )
          {
              if ( actionEvent.getSource() == playJButton )
                 currentSound.play(); // play AudioClip once
               else if ( actionEvent.getSource() == loopJButton )
                  currentSound.loop(); // play AudioClip continuously
              else if ( actionEvent.getSource() == stopJButton )
                  currentSound.stop(); // stop AudioClip
               } // end method actionPerformed
           } // end class ButtonHandler
         // end class LoadAudioAndPlay

    public AudioClip getPop()
	{
		double r = Math.random();
		int whichResponse = (int)(r * 3);
		AudioClip response = null;
		if (whichResponse == 0)
		{
			response = sound1;
		}
		else if (whichResponse == 1)
		{
			response = sound7;
		}
		else if(whichResponse==2)
		{
			response= sound8; 
		}
		return response;
	}
    public AudioClip getInstrumental()
  	{
  		double r = Math.random();
  		int whichResponse = (int)(r * 3);
  		AudioClip response = null;
  		if (whichResponse == 0)
  		{
  			response = sound2;
  		}
  		else if (whichResponse == 1)
  		{
  			response = sound9;
  		}
  		else if(whichResponse==2)
  		{
  			response= sound10; 
  		}
  		return response;
  	}
    public AudioClip getRap()
  	{
  		double r = Math.random();
  		int whichResponse = (int)(r * 3);
  		AudioClip response = null;
  		if (whichResponse == 0)
  		{
  			response = sound3;
  		}
  		else if (whichResponse == 1)
  		{
  			response = sound11;
  		}
  		else if(whichResponse==2)
  		{
  			response= sound12; 
  		}
  		return response;
  	}
    public AudioClip getCountry()
  	{
  		double r = Math.random();
  		int whichResponse = (int)(r * 3);
  		AudioClip response = null;
  		if (whichResponse == 0)
  		{
  			response = sound4;
  		}
  		else if (whichResponse == 1)
  		{
  			response = sound13;
  		}
  		else if(whichResponse==2)
  		{
  			response= sound14; 
  		}
  		return response;
  	}
    public AudioClip getRock()
  	{
  		double r = Math.random();
  		int whichResponse = (int)(r * 3);
  		AudioClip response = null;
  		if (whichResponse == 0)
  		{
  			response = sound5;
  		}
  		else if (whichResponse == 1)
  		{
  			response = sound15;
  		}
  		else if(whichResponse==2)
  		{
  			response= sound16; 
  		}
  		return response;
  	}
    public AudioClip getOldies()
  	{
  		double r = Math.random();
  		int whichResponse = (int)(r * 3);
  		AudioClip response = null;
  		if (whichResponse == 0)
  		{
  			response = sound6;
  		}
  		else if (whichResponse == 1)
  		{
  			response = sound17;
  		}
  		else if(whichResponse==2)
  		{
  			response= sound18; 
  		}
  		return response;
  	}
   	}

