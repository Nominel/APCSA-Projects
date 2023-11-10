package shape;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.BLACK);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.BLACK);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
		Shape shape1 = new Shape(100,100,50,50,Color.PINK);
		//tell your shape to draw
		shape1.draw(window);
		//instantiate a Shape
		Shape shape2 = new Shape(500,100,100,100,Color.PINK);
		//tell your shape to draw
		shape2.draw(window);
		//instantiate a Shape
		Shape shape3 = new Shape(100,300,200,200,Color.PINK);
		//tell your shape to draw
		shape3.draw(window);
	}
}