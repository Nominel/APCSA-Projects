package window4;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window4 implements ActionListener{

    private final JFrame window;
    private final JPanel panel;
    private final BoxLayout layout;
    private final JButton texasButton;
    private final JButton caliButton;
    private final JButton nyButton;

    public Window4(int width, int height){
        window = new JFrame();
        window.setSize(width,height);
        window.setTitle("Choose Your Color");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = (JPanel) window.getContentPane();
        layout = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        Border border = BorderFactory.createEmptyBorder(10,10,10,10);
        panel.setBorder(border);

        texasButton = new JButton("Texas");
        caliButton = new JButton("California");
        nyButton = new JButton("New York");

        texasButton.addActionListener(this);
        caliButton.addActionListener(this);
        nyButton.addActionListener(this);

        window.add(texasButton);
        window.add(caliButton);
        window.add(nyButton);

        texasButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        caliButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nyButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object control = event.getSource();
        if(control== texasButton)
            JOptionPane.showMessageDialog(null,"State Capital: Austin\nBig City: Houston");
        else if(control== caliButton)
            JOptionPane.showMessageDialog(null,"State Capital: Sacramento\nBig City: Los Angeles");
        else if(control== nyButton)
            JOptionPane.showMessageDialog(null,"State Capital: Albany\nBig City: New York");
    }
}
