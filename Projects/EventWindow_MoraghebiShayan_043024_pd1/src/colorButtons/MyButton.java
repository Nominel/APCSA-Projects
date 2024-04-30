package colorButtons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyButton extends JFrame implements ActionListener {

	private JFrame frame;
	private JButton red;
	private JButton green;
	private JButton blue;
	private JButton white;

	public MyButton() {
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 9);
		frame = new JFrame("CVHS Rhinos");
		Color c = new Color(255, 255, 255);

		red = new JButton("Red");
		//red.setBounds(0,0,10,10);//set the button size
		red.setFont(font); //print button label on the
		red.setBackground(c);

		green = new JButton("Green");
		//green.setBounds(0,0,100,100);
		green.setFont(font);
		green.setBackground(c);

		blue = new JButton("Blue");
		//blue.setBounds(0,0,100,100);
		blue.setFont(font);
		blue.setBackground(c);

		white = new JButton("White");
		//white.setBounds(0,0,100,100);
		white.setFont(font);
		white.setBackground(c);

		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(white);

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		white.addActionListener(this);

		frame.getContentPane().setBackground(Color.cyan);
		frame.setLayout(new GridLayout(2,3,500,500));
		frame.setSize(1000,1000); //put size as you deem necessary to make great visual
		frame.setVisible(true); //What happens when the argument = false?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == red) {
			frame.getContentPane().setBackground(Color.RED);
		}
		if (e.getSource() == green) {
			frame.getContentPane().setBackground(Color.GREEN);
		}
		if (e.getSource() == blue) {
			frame.getContentPane().setBackground(Color.BLUE);
		}
		if (e.getSource() == white) {
			frame.getContentPane().setBackground(Color.WHITE);
		}
	}
}
