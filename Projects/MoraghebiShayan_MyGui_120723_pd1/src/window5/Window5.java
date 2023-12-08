package window5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window5 implements ActionListener{

    private final JFrame window;
    private final JPanel panel;
    private final BorderLayout layout;
    private final JButton whopperButton;
    private final JButton chickenNuggetsButton;
    private final JButton friesButton;

    public Window5(int width, int height){
        window = new JFrame();
        window.setSize(width,height);
        window.setTitle("Choose Your Color");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = (JPanel) window.getContentPane();
        layout = new BorderLayout(10,10);
        panel.setLayout(layout);

        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        panel.setBorder(border);

        whopperButton = new JButton("Whopper");
        chickenNuggetsButton = new JButton("Chicken Nuggets");
        friesButton = new JButton("Fries");

        whopperButton.addActionListener(this);
        chickenNuggetsButton.addActionListener(this);
        friesButton.addActionListener(this);

        window.add(whopperButton,BorderLayout.NORTH);
        window.add(chickenNuggetsButton,BorderLayout.CENTER);
        window.add(friesButton,BorderLayout.SOUTH);


        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object control = event.getSource();
        if(control== whopperButton)
            JOptionPane.showMessageDialog(null,"Whopper\n677 Cal/Whopper\nFun Fact: The first Whopper was sold in 1957 at the chains first restaurant in Miami");
        else if(control== chickenNuggetsButton)
            JOptionPane.showMessageDialog(null,"Chicken Nuggets\n430 Cal/10 Nuggets\nFun Fact: The largest recorded chicken nugget weighed 51.1 pounds and was 3.25 feet long and 2 feet wide");
        else if(control== friesButton)
            JOptionPane.showMessageDialog(null,"Fries\n328 Cal/Medium Serving\nFun Fact: Belgium consumes the most French fries of any European country");
    }
}
