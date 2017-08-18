package Test2;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class ShipPart extends Node
{
	private int health;
	
	public ShipPart(boolean clickable, String ID, Node theParent, Rectangle rect, int health) 
	{
		super(clickable, ID, theParent, rect);
		this.health = health;
	}

	public int getHealth()
	{
		return health;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		//ShipPartMenu menu = getNodeInMap(super.getID() + "-menu");
		// ShipPartMenu can be whatever class
		//menu.setActive(true);
		System.out.print(getID() + " clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		
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
	protected void initChildren() 
	{
		
	}

	@Override
	public void tickAction() 
	{
		
	}

}
