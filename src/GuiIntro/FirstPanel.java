package GuiIntro;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FirstPanel extends JPanel
{
	private int x = 30;
	private int y = 30;
	private int radius = 60;
	int[][] locations;
	
	public FirstPanel()
	{
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		g.fillOval(x - radius, y - radius , 2 * radius,  2 * radius);
		System.out.println("fdsha");
	}
	
	public void setCoor(int xl, int yl)
	{
		x = xl;
		y = yl;
		repaint();
	}
}
