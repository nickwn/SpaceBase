package Test2;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class ShipTester 
{
	public static void main(String[] args)
	{
		JFrame testWindow = new JFrame("ship test");
		testWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MasterNode master = new MasterNode(true, "master", null, new Rectangle(1000, 1000));
		master.addChild(new Ship(master, new Rectangle(0, 490, 385, 455)));
		
		testWindow.add(master);
		testWindow.setVisible(true);
		testWindow.setSize(1800, 1800);
		//testWindow.revalidate();
		master.repaint();
		testWindow.repaint();
		
	}
}
