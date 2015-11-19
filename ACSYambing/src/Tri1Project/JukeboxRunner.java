package Tri1Project;
import javax.swing.JFrame; 
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
public class JukeboxRunner extends JFrame implements ActionListener {
private static final int WIDTH = 10000;
private static final int HEIGHT = 5000;
private JTextArea text;
private JButton pop;
private JButton instrumental;
private JButton rap;
private JButton country;
private JButton rock;
private JButton oldies; 
	public JukeboxRunner()
	{
		super("Jukebox Runner");
		JPanel main= new JPanel();
		
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
		JPanel top= new JPanel();
		JPanel bot= new JPanel();
		
		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
		
		text= new JTextArea();
		text.setText("Please select the type of music you'd like to listen to!");
		
		pop = new JButton("Pop");
		pop.addActionListener(this);
		pop.setActionCommand("pop");
		
		instrumental= new JButton("Instrumental");
		instrumental.addActionListener(this);
		instrumental.setActionCommand("instrumental");
		
		rap = new JButton("Rap");
		rap.addActionListener(this);
		rap.setActionCommand("rap");
		
		country = new JButton("Country");
		country.addActionListener(this);
		country.setActionCommand("country");
		
		rock = new JButton("Rock");
		rock.addActionListener(this);
		rock.setActionCommand("rock");
		
		oldies = new JButton("Oldies");
		oldies.addActionListener(this);
		oldies.setActionCommand("oldies");
		
		bot.add(pop);
		bot.add(instrumental);
		bot.add(rap);
		bot.add(country);
		bot.add(rock);
		bot.add(oldies);
		
		top.add(text);
		
		main.add(top);
		main.add(bot);
		
		getContentPane().add(main);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
	Jukebox juke= new Jukebox();
		String screenText= "";
		screenText= juke.getResponse(e.getActionCommand());
	}
	public static void main( String args[])
	{
		JukeboxRunner run = new JukeboxRunner();
	}
}