package window2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window2 implements ActionListener{

    private final JFrame window;
    private final JButton redButton;
    private final JButton greenButton;

    public Window2(int width, int height){
        window = new JFrame();
        window.setSize(width,height);
        window.setTitle("Choose Your Color");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        window.setLayout(layout);

        redButton = new JButton("Red");
        greenButton = new JButton("Green");

        greenButton.addActionListener(this);
        redButton.addActionListener(this);

        window.add(redButton);
        window.add(greenButton);

        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object control = event.getSource();
        if(control==redButton)
            window.getContentPane().setBackground(Color.RED);
        else if(control==greenButton)
            window.getContentPane().setBackground(Color.GREEN);
    }
}
