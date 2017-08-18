package Test2;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class Ship extends Node 
{	
	
	public Ship(Node theParent, Rectangle rect) 
	{
		//System.out.println("ship constructor");
		super(true, "ship", theParent, rect);
		addChild(new ShipPart(true, "cockpit", this, new Rectangle(115, 100, 160, 65), 100));
		addChild(new ShipPart(true, "main-engine", this, new Rectangle(80, 490, 230, 75), 100));
		addChild(new ShipPart(true, "left-engine", this, new Rectangle(0, 340, 85, 240), 100));
		addChild(new ShipPart(true, "right-engine", this, new Rectangle(300, 340, 85, 240), 100));
		addChild(new ShipPart(true, "storage", this, new Rectangle(115, 315, 160, 215), 100));
		add(new Texture("ship"));
		
		System.out.println("constructor");
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void initChildren() 
	{
		this.add(new Texture("ship"));

	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub

	}

}
