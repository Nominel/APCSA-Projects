package phone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneDialer implements ActionListener {

	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton dash;
	private JButton dial;
	private String number;
	private JLabel numberLabel;

	public PhoneDialer() {
		number = "";
		JFrame frame = new JFrame();
		frame.setTitle("Shayan's Phone");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.add(mainPanel);

		JPanel numberPanel = new JPanel();
		numberPanel.setLayout(new FlowLayout());
		numberLabel = new JLabel("Enter number to dial: \n"+number);
		numberPanel.add(numberLabel);
		mainPanel.add(numberPanel);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 3,5,5));
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		dash = new JButton("-");
		zero = new JButton("0");

		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(dash);
		buttonPanel.add(zero);

		mainPanel.add(buttonPanel);

		dial = new JButton("Dial number");
		dial.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(dial);

		frame.setVisible(true);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		dash.addActionListener(this);
		zero.addActionListener(this);
		dial.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == dial) {
			JOptionPane.showMessageDialog(null, "Dialing: "+number);
			number = "";
		}
		else if(e.getSource() == one) {
			number+="1";
			numberLabel.setText("Enter number to dial: \n"+number);
		}
		else if(e.getSource() == two) {
			number+="2";
			numberLabel.setText("Enter number to dial: \n"+number);
		}
		else if(e.getSource() == three) {
			number+="3";
			numberLabel.setText("Enter number to dial: \n"+number);
		}
		else if(e.getSource() == four) {
			number+="4";
			numberLabel.setText("Enter number to dial: \n"+number);
		}
		else if(e.getSource() == five) {
			number+="5";
			numberLabel.setText("Enter number to dial: \n"+number);
		}
		else if(e.getSource() == six) {
			number += "6";
			numberLabel.setText("Enter number to dial: \n" + number);
		}
		else if(e.getSource() == seven) {
			number += "7";
			numberLabel.setText("Enter number to dial: \n" + number);
		}
		else if(e.getSource() == eight) {
			number += "8";
			numberLabel.setText("Enter number to dial: \n" + number);
		}
		else if(e.getSource() == nine) {
			number += "9";
			numberLabel.setText("Enter number to dial: \n" + number);
		}
		else if(e.getSource() == dash) {
			number += "-";
			numberLabel.setText("Enter number to dial: \n" + number);
		}
		else if(e.getSource() == zero) {
			number += "0";
			numberLabel.setText("Enter number to dial: \n" + number);
		}
	}
}
