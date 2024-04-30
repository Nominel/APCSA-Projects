package layout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyLayout implements ActionListener {

	private JFrame window;
	private JTextArea text;
	private JButton redBtn;
	private JButton greenBtn;
	private JButton blueBtn;
	private JButton whiteBtn;
	private JPanel myPanel;
	private JPanel topPanel;
	private JPanel bottomPanel;
	
	public MyLayout(int w, int h) {
		window = new JFrame();
		window.setSize(w,h);
		window.setTitle("Choose Your Color");
		window.setLocation(w/2, h/2);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = (JPanel)window.getContentPane();
		myPanel.setSize(w, h);
		myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));

		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

		text = new JTextArea();
		text.setEditable(false);
		text.setFont(new Font("Monospaced", Font.PLAIN, 20));
		text.setText("Click button to change background");
		topPanel.add(text);

		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,2,50,50));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

		redBtn = new JButton("Red");
		bottomPanel.add(redBtn);
		redBtn.addActionListener(this);
		
		greenBtn = new JButton("Green");
		bottomPanel.add(greenBtn);
		greenBtn.addActionListener(this);

		blueBtn = new JButton("Blue");
		bottomPanel.add(blueBtn);
		blueBtn.addActionListener(this);

		whiteBtn = new JButton("White");
		bottomPanel.add(whiteBtn);
		whiteBtn.addActionListener(this);

		myPanel.add(topPanel);
		myPanel.add(bottomPanel);
		
		window.setVisible(true);

	}
	
	public void actionPerformed (ActionEvent event) {
		Object control = event.getSource();
		if(control == redBtn) {
			topPanel.setBackground(Color.RED);
			bottomPanel.setBackground(Color.RED);
		}
		else if(control == greenBtn) {
			topPanel.setBackground(Color.GREEN);
			bottomPanel.setBackground(Color.GREEN);
		}
		else if(control == blueBtn) {
			topPanel.setBackground(Color.BLUE);
			bottomPanel.setBackground(Color.BLUE);
		}
		else if(control == whiteBtn) {
			topPanel.setBackground(Color.WHITE);
			bottomPanel.setBackground(Color.WHITE);
		}
	}

}

