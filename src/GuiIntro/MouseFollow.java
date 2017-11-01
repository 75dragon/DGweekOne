package GuiIntro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseFollow extends MouseAdapter
{
	FirstPanel sendTo;
	public MouseFollow(FirstPanel x)
	{
		sendTo = x;
	}
	
	@Override
    public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		sendTo.setCoor(x, y);
    }
}
