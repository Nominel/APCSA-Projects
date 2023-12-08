package window3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window3 implements ActionListener{

    private final JFrame window;
    private final JPanel panel;
    private final GridLayout layout;
    private final JButton blueButton;
    private final JButton pinkButton;
    private final JButton magentaButton;

    public Window3(int width, int height){
        layout = new GridLayout(3,1,10,10);
        window = new JFrame();
        window.setSize(width,height);
        window.setTitle("Choose Your Color");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLayout(layout);
        panel = (JPanel) window.getContentPane();

        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        panel.setBorder(border);

        blueButton = new JButton("Blue");
        pinkButton = new JButton("Pink");
        magentaButton = new JButton("Magenta");

        blueButton.addActionListener(this);
        pinkButton.addActionListener(this);
        magentaButton.addActionListener(this);

        window.add(blueButton);
        window.add(pinkButton);
        window.add(magentaButton);

        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object control = event.getSource();
        if(control==blueButton)
            panel.setBackground(Color.RED);
        else if(control==pinkButton)
            panel.setBackground(Color.GREEN);
        else if(control==magentaButton)
            panel.setBackground(Color.MAGENTA);
    }
}
