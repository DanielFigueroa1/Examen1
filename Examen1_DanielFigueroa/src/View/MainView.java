package View;

import Model.LogicModel;
import processing.core.PApplet;

public class MainView extends PApplet {
	
	LogicModel logicModel; 
	public static void main(String[] args) {
	
		
	PApplet.main(MainView.class.getName());
	

	}
	
	public void settings() {
		size(900, 700);
	}
	
	public void setup() {
		logicModel = new LogicModel(this);
	}
	
	public void draw() {
		background (0);
		logicModel.pintar();
	}
	//esto controller
	public void mousePressed() {
		logicModel.mouse();
	}
}


