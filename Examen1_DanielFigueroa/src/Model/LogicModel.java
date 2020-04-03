package Model;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import processing.core.PApplet;

public class LogicModel {

	String[] textoNetflix;
	PApplet app;
	ArrayList <ItemModel> items;  
	
public LogicModel(PApplet app) {
		
		this.app = app;
		items = new ArrayList<ItemModel>();
		textoNetflix = app.loadStrings("/data/netflix.txt");
		
		
		for (int i = 0; i < textoNetflix.length; i++) {
			String [] infotextoNetflix = textoNetflix[i].split(",");
			
				
				items.add(new ItemModel(app, infotextoNetflix[0], infotextoNetflix[1], infotextoNetflix[2], infotextoNetflix[3], infotextoNetflix[4]));

			
			
		}
		
		Collections.sort(items);
	}

public void pintar() {
	app.fill(255);
	app.text("nombre" + "                        " + "anoEstreno" + "                        " + "rating" + "                        "+ "tipo" + "                        " + "foto" + "                        ", 200, 20);
	for (int i = 0; i < items.size(); i++) {
		
		items.get(i).pintar(200,40*(i+1));
	
	}
	
	app.fill(255);
	app.rect (158,420,110,40);
	app.rect (268,420,110,40);
	app.rect (378,420,110,40);
	app.rect (489,420,110,40);
	app.rect (600,420,110,40);
	app.rect (800,420,110,40);
	app.fill(0);
	app.text ("ordenar nombre",184,443);
	app.text ("ordenar año estreno",280,443);
	app.text ("ordenar rating %",398,443);
	app.text ("ordenar tipo",510,443);
	app.text ("ordenar foto",600,443);
	app.text ("guardar",834,443); //zona x 801, 907
	}

public void mouse() {
	System.out.println(app.mouseX + " " + app.mouseY );
	
	if (app.mouseX > 160 && app.mouseX < 266 && app.mouseY > 422 && app.mouseY < 459) {
		Collections.sort(items, new CompararNombreModel());
	}
	if (app.mouseX > 272 && app.mouseX < 374 && app.mouseY > 422 && app.mouseY < 459) {
		Collections.sort(items, new CompararAnoEstrenoModel());
	}
	if (app.mouseX > 381 && app.mouseX < 485 && app.mouseY > 422 && app.mouseY < 459) {
		Collections.sort(items, new CompararRatingModel());
	}
	if (app.mouseX > 492 && app.mouseX < 594 && app.mouseY > 422 && app.mouseY < 459) {
		Collections.sort(items, new CompararTipoModel());
	}
	if (app.mouseX > 492 && app.mouseX < 594 && app.mouseY > 422 && app.mouseY < 459) {
		Collections.sort(items, new CompararFotoModel());
	}
	if (app.mouseX > 801 && app.mouseX < 907 && app.mouseY > 422 && app.mouseY < 459) {
		String[] datos = new String[items.size()]; 
		
		for (int i = 0; i < items.size(); i++) {
			ItemModel a = items.get(i);
			datos[i]=(+a.getNombre().toLowerCase()+","+a.getAnoEstreno()+","+a.getRating()+","+a.getTipo()+","+a.getFoto()); 
			} app.saveStrings("/data/ListaNueva.txt",datos);
		}
	}
}
