package GuiIntro;

import java.awt.BorderLayout;
import java.awt.Color;

public class Main
{
	private static int xDimentionSize = 800;
	private static int yDimentionSize = 800;
	Circle cir;
	
//	public Main()
//	{
//		FirstFrame frame = new FirstFrame(xDimentionSize, yDimentionSize);
//		FirstPanel panel = new FirstPanel( cir );
//		MouseListen lis = new MouseListen(panel);
//		frame.add(panel, BorderLayout.CENTER);
//		panel.addMouseListener(lis);
//		cir = new Circle(50, 50, 150, 10, Color.RED );
//	}
	
	public Main()
	{
		FirstFrame frame = new FirstFrame(xDimentionSize, yDimentionSize);
		FirstPanel panel = new FirstPanel();
		frame.add(panel, BorderLayout.CENTER);
		MouseListen lis = new MouseListen(panel);
		panel.addMouseListener(lis);
	}
	
	public static void main( String args[] )
	{
		new Main();
	}
}
