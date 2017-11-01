package GuiIntro;

import java.awt.Color;
import java.awt.Graphics;

public class Circle
{
	double x;
	double y;
	int radius;
	int speed;
	double vectorAngle;
	Color color;

	public Circle(int x, int y, int rad, int spd, Color col)
	{
		this.x = x;
		this.y = y;
		radius = rad;
		speed = spd;
		color = col;
	}

	public void update()
	{
		x = x + speed * Math.cos(Math.toRadians(vectorAngle));
		y = y + speed * Math.sin(Math.toRadians(vectorAngle));
	}

	public void drawMe(Graphics g)
	{
		g.setColor(color);
		g.fillOval((int) (x - radius), (int) (y - radius), 2 * radius, 2 * radius);
	}
}
