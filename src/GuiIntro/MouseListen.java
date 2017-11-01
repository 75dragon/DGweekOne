package GuiIntro;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListen implements MouseListener
{
	FirstPanel sendTo;
	public MouseListen(FirstPanel x)
	{
		sendTo = x;
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		sendTo.setCoor(x, y);
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

	public void mouseMoved(MouseEvent e)
	{
		
	}
}
