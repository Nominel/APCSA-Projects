import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TripPrice implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JTextField distance;
	private JTextField mileage;
	private JButton calculate;
	private JSpinner price;
	private JLabel priceLabel;
	private JLabel distanceLabel;
	private JLabel mileageLabel;
	private JLabel outputLabel;
	private JTextField output;

	public TripPrice() {
		frame = new JFrame("Price per Trip");
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.add(panel);
		frame.setSize(550,400);

		JPanel gasPanel = new JPanel();
		gasPanel.setLayout(new FlowLayout());
		SpinnerNumberModel model = new SpinnerNumberModel(3, 0.01, 99.99, 0.01);
		price = new JSpinner(model);
		price.setFont(new Font("Arial", Font.PLAIN, 26));
		priceLabel = new JLabel("GAS COST/GALLON ($):");
		priceLabel.setFont(new Font("Arial", Font.PLAIN, 26));
		priceLabel.setForeground(Color.BLUE);
		gasPanel.add(priceLabel);
		gasPanel.add(price);
		panel.add(gasPanel);

		JPanel mileagePanel = new JPanel();
		mileagePanel.setLayout(new FlowLayout());
		mileageLabel = new JLabel("MPG:");
		mileageLabel.setForeground(Color.GREEN);
		mileageLabel.setFont(new Font("Arial", Font.PLAIN, 26));
		mileage = new JTextField();
		mileage.setEditable(true);
		mileage.setColumns(10);
		mileage.setFont(new Font("Arial", Font.PLAIN, 26));
		mileagePanel.add(mileageLabel);
		mileagePanel.add(mileage);
		panel.add(mileagePanel);

		JPanel distancePanel = new JPanel();
		distancePanel.setLayout(new FlowLayout());
		distanceLabel = new JLabel("DISTANCE (mi):");
		distanceLabel.setForeground(Color.RED);
		distanceLabel.setFont(new Font("Arial", Font.PLAIN, 26));
		distance = new JTextField();
		distance.setEditable(true);
		distance.setFont(new Font("Arial", Font.PLAIN, 26));
		distance.setColumns(10);
		distancePanel.add(distanceLabel);
		distancePanel.add(distance);
		panel.add(distancePanel);

		calculate = new JButton("Calculate");
		calculate.addActionListener(this);
		calculate.setBackground(Color.RED);
		calculate.setForeground(Color.WHITE);
		calculate.setFont(new Font("Arial", Font.PLAIN, 26));
		calculate.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(calculate);

		JPanel outputPanel = new JPanel();
		outputPanel.setLayout(new FlowLayout());
		outputLabel = new JLabel("TRIP COST ($):");
		outputLabel.setForeground(Color.MAGENTA);
		outputLabel.setFont(new Font("Arial", Font.PLAIN, 26));
		output = new JTextField();
		output.setEditable(false);
		output.setColumns(10);
		output.setFont(new Font("Arial", Font.PLAIN, 26));
		outputPanel.add(outputLabel);
		outputPanel.add(output);
		panel.add(outputPanel);

		panel.setBackground(Color.BLACK);
		outputPanel.setBackground(Color.BLACK);
		distancePanel.setBackground(Color.BLACK);
		mileagePanel.setBackground(Color.BLACK);
		gasPanel.setBackground(Color.BLACK);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == calculate) {
			double mpg = Double.parseDouble(mileage.getText());
			double d = Double.parseDouble(distance.getText());
			double p = (Double) price.getValue();
			double cost = (d/mpg) * p;
			output.setText("" + cost);
		}
	}
}
