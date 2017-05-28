package Entities;

import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Menus.Menu;
import importing.ImportManager;

public class Ship extends PolyEntity implements MenuSpawnable {
	
	public Ship(int x, int y, int h, int w, double angel){
		super(0, 0, h, w, angel, "tomShip", null);
		int[] shipX = {0,115,115,275,275,385,385,310,310,80,80,0};
		int[] shipY = {100,100,35,35,100,100,340,340,490,490,345,345};
		int[] EngineRx = {300,385,385,300};
		int[] EngineLx = {0,85,85,0};
		int[] EngineLRy = {100,100,340,340};
		int[] cockpitX = {115,275,275,115};
		int[] cockpitY = {35,35,100,100};
		int[] storageX = {115,275,275,115};
		int[] storageY = {100,100,315,315};
		int[] mainEngineX = {80,310,310,80};
		int[] mainEngineY = {315,315,490,490};
		
		
		components = new ArrayList<Entity>();
		this.setBounds(new Polygon((shipX),(shipY),shipX.length));
		components.add(new ShipModule(new Polygon(EngineRx,EngineLRy,EngineRx.length), 
				"EngineR", smallest(EngineRx), smallest(EngineLRy)));
		components.add(new ShipModule(new Polygon((EngineLx),(EngineLRy),EngineLRy.length), 
				"EngineL", smallest(EngineLx), smallest(EngineLRy)));
		components.add(new ShipModule(new Polygon((cockpitX), (cockpitY), cockpitX.length), 
				"Cockpit", smallest(cockpitX), smallest(cockpitY)));
		components.add(new ShipModule(new Polygon((storageX), (storageY), storageX.length), 
				"Storage", smallest(storageX), smallest(storageY)));
		components.add(new ShipModule(new Polygon((mainEngineX), (mainEngineY), mainEngineX.length), 
				"MainEngine", smallest(mainEngineX), smallest(mainEngineY)));
		moveTo(x, y, 0);
		//clicked = null;
		//components
	}

	
	@Override
	public void whenClicked(int x, int y){
		super.whenClicked(x, y);
		ImportManager.playSound();
	}
	
	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		try{
			return ((ShipModule)clicked).spawnMenu();
		}
	    catch(NullPointerException e){
	    	System.out.println("Your shit's null boi");
	    	return null;
	    }
	}
	
	public boolean engineClicked(){
		if(clicked != null)
			return ((ShipModule)clicked).modType().equals("EngineL");
		return false;
	}

}
