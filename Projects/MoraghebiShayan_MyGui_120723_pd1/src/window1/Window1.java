package window1;

import javax.swing.*;
import java.awt.*;

public class Window1{

    public Window1(int width, int height){
        JFrame window = new JFrame();
        window.setSize(width,height);
        window.setTitle("Choose Your Color");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        window.setLayout(layout);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");

        window.add(redButton);
        window.add(greenButton);

        window.setVisible(true);
    }
}
