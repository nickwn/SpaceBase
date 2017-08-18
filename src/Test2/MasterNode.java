package Test2;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class MasterNode extends Node
{

	public MasterNode(boolean clickable, String ID, Node theParent, Rectangle rect) 
	{
		super(clickable, ID, theParent, rect);
		//paintAll(getGraphics());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initChildren() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics g)
	{
		getNodeInMap("ship").paintAll(g);
	}

}
