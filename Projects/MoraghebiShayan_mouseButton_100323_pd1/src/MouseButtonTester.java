import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class MouseButtonTester extends JFrame implements MouseListener
{
    private int mouseX, mouseY;
    private int mouseButton;
    private boolean isFirstRun;
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final long serialVersionUID = 0; //use this if you do not like warnings
    ImageObserver observer = new ImageObserver() {
        @Override
        public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
            return false;
        }
    };

    // Create a buffered image in java
    File inputFile1 = new File("saul.jpg");  // The file must be in project (root) directory

    BufferedImage bufferedImage1;

    {
        try {
            bufferedImage1 = ImageIO.read(inputFile1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    File inputFile2 = new File("spongebob.jpg");  // The file must be in project (root) directory

    BufferedImage bufferedImage2;

    {
        try {
            bufferedImage2 = ImageIO.read(inputFile2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    File inputFile3 = new File("caoilin.png");  // The file must be in project (root) directory

    BufferedImage bufferedImage3;

    {
        try {
            bufferedImage3 = ImageIO.read(inputFile3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MouseButtonTester() throws IOException {
        super("Mouse Button Tester");
//set up all variables
        mouseX = mouseY = 0;
        mouseButton = 0;
        isFirstRun = true;
//set up the Frame
        setSize(WIDTH,HEIGHT);
        setBackground(Color.WHITE);
        setVisible(true);
//start trapping for mouse clicks
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        mouseX=e.getX();
        mouseY=e.getY();
        mouseButton = e.getButton();
        repaint();
    }
    public void paint( Graphics window )
    {
        if(isFirstRun)
        {
            window.setColor(Color.WHITE);
            window.fillRect(0,0,WIDTH, HEIGHT);
            isFirstRun=false;
//change isFirstRun
        }
        window.setFont(new Font("TAHOMA",Font.BOLD,12));
        window.setColor(Color.BLUE);
        window.drawString("MOUSE BUTTON TESTER", 420,55);
        draw(window);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void draw(Graphics window)
    {
        if(mouseButton==MouseEvent.BUTTON1) //left mouse button pressed
        {
//window.drawString("BUTTON1", 50,200); //debug code
            window.drawImage(bufferedImage1,mouseX,mouseY, observer);
        }
//right mouse button pressed
        if(mouseButton==MouseEvent.BUTTON2)
        {
            window.drawImage(bufferedImage2,mouseX,mouseY, observer);
        }
//any other mouse button pressed
        if(mouseButton==MouseEvent.BUTTON3)
        {
            window.drawImage(bufferedImage3,mouseX,mouseY, observer);
        }
    }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
}