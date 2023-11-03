package shape;

import java.awt.*;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
        width = wid;
        height = ht;
        color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(Color.BLACK);
      window.fillRect(xPos+5, yPos+5, width-10, height-10);
      window.setColor(color);
      window.fillOval(xPos, yPos, width, height);
      window.setColor(Color.BLACK);
           // Your initial font size guess.
           int fontSize = 1;

           // Get the current font, and apply a new size to it.
           Font font = window.getFont().deriveFont((float)fontSize);

           // Update the graphics context font to your new derived font.
           window.setFont(font);

           // Repeat this process, increasing or decreasing font size,
           // until the stringWidth is the size of your rectangle.
           FontMetrics fm = window.getFontMetrics();
           int strWidth = fm.stringWidth("CVHS");
           while (strWidth < width) {
               fontSize += 1;
               font = window.getFont().deriveFont((float)fontSize);
               window.setFont(font);
               fm = window.getFontMetrics();
               strWidth = fm.stringWidth("CVHS");
           }
           //================================================================
           window.setColor(color);
           window.fillRect(xPos, yPos, width, height);
           window.setColor(Color.BLACK);
           window.fillRect(xPos+5, yPos+5, width-10, height-10);
           window.setColor(color);
           window.fillOval(xPos, yPos, width, height);
           window.setColor(Color.BLACK);
           String str = "CVHS";
           // Since FontMetric changed due to the new font, we need to recalculate these
           strWidth = fm.stringWidth(str);
           int strAscent = fm.getAscent();
           // Center String horizontally and vertically
           int xStrLocation = xPos + (width - strWidth) / 2;
           int yStrLocation = yPos + ((height - strAscent) / 2) + strAscent;
           window.drawString(str, xStrLocation, yStrLocation);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}