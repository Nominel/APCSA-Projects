import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerOneGear implements ActionListener {
	// class-level variables
	JFrame myFrame;
	String playerName;
	JTextField teamTextField;
	JSpinner numLivesSpinner;
	JButton startButton;
	JTextArea outputTextArea;

	public PlayerOneGear()
	{
		// get player's name in pop-up dialog
		playerName = JOptionPane.showInputDialog("Enter player name: ");
		// create new JFrame
		myFrame = new JFrame();
		// set the frame title, size, location
		myFrame.setTitle("Player One");
		// make sure program terminates when window is clos
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// assign an overall layout
		JPanel mainPanel = (JPanel)myFrame.getContentPane();
		BoxLayout mainLayout = new BoxLayout(mainPanel,BoxLayout.Y_AXIS);
		mainPanel.setLayout(mainLayout);
		// add an overall border
		Border myBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		mainPanel.setBorder(myBorder);
		// create team panel
		JPanel teamPanel = new JPanel();
		teamPanel.setLayout(new BoxLayout(teamPanel, BoxLayout.Y_AXIS));
		// add label and text field to team panel
		teamPanel.add(new JLabel("Welcome " + playerName +". What is your team name?"));
		teamTextField = new JTextField(20);
		teamPanel.add(teamTextField);
		// add team panel to main panel, plus some spacing
		mainPanel.add(teamPanel);
		mainPanel.add(new JLabel(" "));
		// create number of lives panel
		JPanel livesPanel = new JPanel();
		livesPanel.setLayout(new FlowLayout());
		// add label and spinner to lives panel
		livesPanel.add(new JLabel("Select number of lives: "));
		numLivesSpinner = new JSpinner(new SpinnerNumberModel(3, 1, 5, 1));
		livesPanel.add(numLivesSpinner);
		// add lives panel to main panel, plus some spacing
		mainPanel.add(livesPanel);
		mainPanel.add(new JLabel(" "));
		// create start panel
		JPanel startPanel = new JPanel();
		startPanel.setLayout(new BoxLayout(startPanel, BoxLayout.Y_AXIS));
		// add start button and output text area to start p
		startButton = new JButton("Start");
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startPanel.add(startButton);
		startPanel.add(new JLabel(" "));
		outputTextArea = new JTextArea(5,30);
		outputTextArea.setLineWrap(true);
		startPanel.add(outputTextArea);
		// add start panel to main panel
		mainPanel.add(startPanel);
		// link buttons to our actionPerformed() function
		startButton.addActionListener(this);
		// pack and make the frame visible
		myFrame.pack();
		myFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event)
	{
		Object control = event.getSource();
		// if startButton was clicked
		if (control == startButton)
		{
			// read team name
			String teamName = teamTextField.getText();
			// read number of lives
			int numLives = (int)numLivesSpinner.getValue();
			// form output statement
			String output = "Welcome " + playerName + " of team " + teamName+ ". You are starting with " + numLives + " lives.";
			// update output text area
			outputTextArea.setText(output);
		}
	}
}
