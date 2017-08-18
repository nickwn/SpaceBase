package Test2;

import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import javax.swing.JPanel;

public abstract class Node extends JPanel implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5095569851583415778L;
	protected static Map<String, Node> allNodes = new HashMap<String, Node>();
	protected String id;
	protected Map<String , Node> children;
	protected Node parent;
	protected Rectangle bounds;
	
	public Node(boolean clickable, String ID, Node theParent, Rectangle rect) {
		super(null);
		if(clickable)
			this.addMouseListener(this);
		id = ID;
		children = new HashMap<String , Node>();
		this.initChildren();
		parent = theParent;
		bounds = rect;
		super.setBounds(bounds);
		allNodes.put(id, this);
	}
	
	public void setActive(boolean active)
	{
		if(parent != null || active == false)
			removeChild(this);
		else
			addChild(this);
	}
	
	public String getID(){
		return id;
	}
	
	public Node getChild(String child){
		return children.get(child);
	}
	
	protected abstract void initChildren();
	
	public Node removeChild(Node e)
	{
		remove(e);
		return children.remove(e.getID());
	}
	
	public void addChild(Node e)
	{
		children.put(e.getID(), e);
		this.add(e);
	}
	
	public abstract void tickAction();
	
	public Node getNodeInTree(Queue<String> path){
		String next = path.remove();
		Node child;
		if(path.size()==0)
			return this;
		else if(parent.getID().equals(next))
			parent.getNodeInTree(path);
		else if((child = children.get(next)) != null)
			child.getNodeInTree(path);
		return null;
	}
	
	public Node getNodeInMap(String ID){
		return allNodes.get(ID);
	}
	
}
