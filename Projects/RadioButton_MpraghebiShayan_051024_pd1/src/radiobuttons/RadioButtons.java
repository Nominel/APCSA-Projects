package radiobuttons;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtons extends JFrame implements ActionListener{

	private JTextField textField;
	private JRadioButton radioPlain;
	private JRadioButton radioItalic;
	private JRadioButton radioBold;

	public RadioButtons()
	{
		System.setProperty("sun.java2d.uiScale", "1.5");
		JFrame myFrame = new JFrame();
		myFrame.setLayout(new FlowLayout());
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = (JPanel)myFrame.getContentPane();

		// create ButtonGroup and new JRadioButtons
		ButtonGroup radioGroup = new ButtonGroup();
		radioPlain = new JRadioButton("Plain");
		radioItalic = new JRadioButton("Italic");
		radioBold = new JRadioButton("Bold");

		// select the plain radio button by default
		radioPlain.setSelected(true);

		// add radio buttons to group
		radioGroup.add(radioPlain);
		radioGroup.add(radioItalic);
		radioGroup.add(radioBold);

		// add radio buttons to panel
		mainPanel.add(radioPlain);
		mainPanel.add(radioItalic);
		mainPanel.add(radioBold);

		// register action listener for each button
		radioPlain.addActionListener(this);
		radioItalic.addActionListener(this);
		radioBold.addActionListener(this);

		// create and add text field to panel
		textField = new JTextField( "RadioButton font", 25);
		mainPanel.add(textField);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	public void actionPerformed( ActionEvent event)
	{
		Object control = event.getSource();
		int style; // this will hold the selected font

		// check which command has been sent
		if (control == radioPlain) {
			style = Font.PLAIN;
		}
		else if (control == radioItalic) {
			style = Font.ITALIC;
		}
		else {
			style = Font.BOLD;
		}

		// update font based on selected style
		Font font = new Font( "TimesRoman", style, 14 );
		textField.setFont( font );
	}
}
