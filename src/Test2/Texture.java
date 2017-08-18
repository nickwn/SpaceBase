package Test2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Texture extends JPanel 
{
	private Image image;
	private boolean visible;
	
	public Texture(String img) 
	{
		image = ImportManager.getImage(img);
		visible = true;
	}
	
	public void setVisible(boolean v)
	{
		visible = v;
	}
	
	public boolean getVisible()
	{
		return visible;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(visible)
		{
			System.out.println("painting");
			g.drawImage(image, 0, 0, this);
	
		}
	}
	
}
