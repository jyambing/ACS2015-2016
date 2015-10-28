package guiLabs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class TranslatorRunner extends JFrame implements ActionListener {
	//this variable is the area to which all text is written
		private JTextArea text;

		//these are the buttons that can be clicked
		private JButton kumusta;
		private JButton kaibigan;
		private JButton mahal;

		public TranslatorRunner()
		{
			super("Translator Runner");

			setSize(WIDTH,HEIGHT);


			//this is the panel to which all objects will be added
			JPanel main = new JPanel();
																				//use X.AXIS or Y.AXIS
			main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

			//these panels will be used to divide the screen
			JPanel top = new JPanel();
			JPanel bot = new JPanel();

			top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));

			//instantiate a new JTextArea
			text = new JTextArea();
			text.setText("--Tagalog to Engish Translator--");

			//instantiate a new JButton and refer rock to it
			kumusta = new JButton("Kumsta Ka?");
			kumusta.addActionListener(this);
			kumusta.setActionCommand("Kumusta Ka?");

			//instantiate a new JButton and refer paper to it
			kaibigan = new JButton("Kaibigan");
			kaibigan.addActionListener(this);
			kaibigan.setActionCommand("Kaibigan");

			//instantiate a new JButton and refer scissors to it
mahal  = new JButton("Mahal");
			mahal.addActionListener(this);
			mahal.setActionCommand("Mahal");

			//add all three buttons to the bottom panel
			bot.add(kumusta);
			bot.add(kaibigan);
			bot.add(mahal);


			//add the text to the top panel
			top.add(text);

			//add both panels to the main panel
			main.add(top);
			main.add(bot);


			//add the main panel to the frame
			getContentPane().add(main);

			setVisible(true);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	  public void actionPerformed(ActionEvent e)
	  {

			//set screenText to the toString() value of each player reference
			String screenText = "";
					if(e.getActionCommand().equals("Kumusta Ka?"))
						screenText= "Kumusta Ka? means 'How are you?' in Tagalog!";
			if(e.getActionCommand().equals("Kaibigan"))
				screenText= "Kaibigan means 'Friend' in Tagalog!";
			if(e.getActionCommand().equals("Mahal"))
				screenText= "Mahal means 'Love' in Tagalog!";

			//set the text to the screen using setText( String txt )
			screenText=screenText + "\n Pick Another Word!";
			text.setText(screenText);
	  }

		public static void main( String args[] )
		{
			TranslatorRunner run = new TranslatorRunner();
		}

}
