import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class GraphicDesignAgency extends JComponent {
  
  // Set up the initial variables for the class
  private int panelWidth;
  private int panelHeight;
  private Color primaryColor;
  private Color secondaryColor;
  
  // Set the constructor for the class
  public GraphicDesignAgency(int width, int height, Color primary, Color secondary){
    panelWidth = width;
    panelHeight = height;
    primaryColor = primary;
    secondaryColor = secondary;
  }
  
  // Create the paint method
  public void paint(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    
    // Set the color of the background
    g2.setColor(primaryColor);
    g2.fillRect(0, 0, panelWidth, panelHeight);
    
    // Create the design elements of the graphics
    g2.setColor(secondaryColor);
    g2.drawRect(0, 0, panelWidth, panelHeight);
       
    // Draw the curves to make the graphic design
    int curveStartX = 0;
    int curveEndX = panelWidth;
    int yCoord = 0;
    int height = panelHeight / 4;
    
    // Draw the curves
    while (curveStartX < curveEndX) {
      g2.drawArc(curveStartX, yCoord, curveEndX, height, 0, 180);
      curveStartX += (panelWidth / 4);
      yCoord += height / 2;
      height *= 2;
      curveEndX -= (panelWidth / 8);
    }
  }
  
}