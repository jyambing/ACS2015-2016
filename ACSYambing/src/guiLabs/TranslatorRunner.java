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
		private JButton rock;
		private JButton paper;
		private JButton scissors;

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
			rock = new JButton("Rock");
			rock.addActionListener(this);
			rock.setActionCommand("rock");

			//instantiate a new JButton and refer paper to it
			paper = new JButton("Paper");
			paper.addActionListener(this);
			paper.setActionCommand("paper");

			//instantiate a new JButton and refer scissors to it
			scissors = new JButton("Scissors");
			scissors.addActionListener(this);
			scissors.setActionCommand("scissors");

			//add all three buttons to the bottom panel
			bot.add(rock);
			bot.add(paper);
			bot.add(scissors);


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
			String screenText = "Pooter: " + "\n";

			//set the text to the screen using setText( String txt )
			text.setText(screenText);
	  }

		public static void main( String args[] )
		{
			RockPaperScissorsRunner run = new RockPaperScissorsRunner();
		}

}
