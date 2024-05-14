package pizza;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PizzaOrder implements ActionListener{

	private JPanel mainPanel;
	private JTextField customerInfo;
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;
	private JComboBox crust;
	private JList toppingList;
	private JCheckBox breadSticks;
	private JCheckBox salad;
	private JCheckBox soda;
	private JTextArea commentsArea;
	private JButton orderButton;
	private JButton resetButton;

	public PizzaOrder(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = (JPanel) frame.getContentPane();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel customerPanel = new JPanel();
		JLabel customerLabel = new JLabel("Customer Nane:");
		customerPanel.add(customerLabel);
		customerInfo = new JTextField(20);
		customerPanel.add(customerInfo);
		mainPanel.add(customerPanel);

		JPanel sizePanel = new JPanel();
		JLabel sizeLabel = new JLabel("Pizza Size:");
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		sizePanel.add(sizeLabel);
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		mainPanel.add(sizePanel);

		JPanel crustPanel = new JPanel();
		JLabel crustLabel = new JLabel("Crust Type:");
		String[] s1 = {"Thin","Thick","Deep Dish"};
		crust = new JComboBox(s1);
		crustPanel.add(crustLabel);
		crustPanel.add(crust);
		mainPanel.add(crustPanel);

		JPanel toppingPanel = new JPanel();
		JLabel toppingLabel = new JLabel("Toppings:");
		String[] s2 = {"Pepperoni", "Sausage", "Green Peppers", "Onions", "Tomatoes", "Anchovies", "Bacon", "Chicken", "Beef", "Olives", "Mushrooms" };
		toppingList = new JList(s2);
		toppingList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane toppingScroller = new JScrollPane(toppingList);
		toppingPanel.add(toppingLabel);
		toppingPanel.add(toppingScroller);
		mainPanel.add(toppingPanel);

		JPanel extraPanel = new JPanel();
		JLabel extraLabel = new JLabel("Extras:");
		extraPanel.add(extraLabel);
		breadSticks = new JCheckBox("Bread Sticks");
		extraPanel.add(breadSticks);
		salad = new JCheckBox("Salad");
		extraPanel.add(salad);
		soda = new JCheckBox("Soda");
		extraPanel.add(soda);
		mainPanel.add(extraPanel);

		JPanel commentsPanel = new JPanel();
		JLabel commentsLabel = new JLabel("Order Comments:");
		commentsArea = new JTextArea(5,20);
		JScrollPane commentsScroller = new JScrollPane(commentsArea);
		commentsPanel.add(commentsLabel);
		commentsPanel.add(commentsScroller);
		mainPanel.add(commentsPanel);

		JPanel buttonsPanel = new JPanel();
		orderButton = new JButton("Place Order");
		resetButton = new JButton("Reset Values");
		resetButton.addActionListener(this);
		orderButton.addActionListener(this);
		buttonsPanel.add(orderButton);
		buttonsPanel.add(resetButton);
		mainPanel.add(buttonsPanel);

		frame.pack();
		frame.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetButton){
			small.setSelected(false);
			medium.setSelected(false);
			large.setSelected(false);
			crust.setSelectedIndex(0);
			breadSticks.setSelected(false);
			salad.setSelected(false);
			soda.setSelected(false);
			commentsArea.setText("");
		}
		else{
			String name = customerInfo.getText();
			String pizzaSize = crust.getSelectedItem().toString();
			String crustType = crust.getSelectedItem().toString();
			ArrayList<String> toppings = (ArrayList<String>) toppingList.getSelectedValuesList();
			String orderComment = commentsArea.getText();
			String order = "PIZZA ORDER FOR: "+name+"\nSIZE:\n\t"+pizzaSize+"\nCRUST TYPE:\n\t"+crustType+"\nTOPPINGS:";
			for(String topping : toppings){
				order += "\n\t"+topping;
			}
			order+="\nEXTRAS:";
			if(breadSticks.isSelected()){
				order+="\n\tBread";
			}
			if(salad.isSelected()){
				order+="\n\tSalad";
			}
			if(soda.isSelected()){
				order+="\n\tSoda";
			}
			order+="\nCOMMENTs:\n"+orderComment;
			JOptionPane.showMessageDialog(null,order);
		}
	}
}
