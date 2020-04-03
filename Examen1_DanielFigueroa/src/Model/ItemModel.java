package Model;

import javax.swing.text.StyledEditorKit.BoldAction;

import processing.core.PApplet;

public class ItemModel implements Comparable <ItemModel> {

	PApplet app;
	private String nombre;
	private String anoEstreno;
	private String rating;
	private String tipo;
	private String foto;
	int x;
	int y;
	
	
	public ItemModel (PApplet app,String nombre,String anoEstreno,String rating,String tipo, String foto) {
		this.app = app;
		this.nombre = nombre;
		this.anoEstreno = anoEstreno;
		this.rating = rating;
		this.tipo = tipo;
		this.foto = foto;
		System.out.println(nombre + " " + anoEstreno + " "+ rating + " " + tipo + " " + foto + " ");
	
	}
	
	public void pintar(int x, int y) {
		this.x = x;
		this.y = y;
		app.fill(255);
		app.text(nombre ,x+90, y);
		app.text(anoEstreno ,x+220, y);
		app.text(rating ,x+300, y);
		app.text(tipo ,x+420, y);
		app.text(foto ,x+540, y);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAnoEstreno() {
		return anoEstreno;
	}

	public void setAnoEstreno(String anoEstreno) {
		this.anoEstreno = anoEstreno;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(ItemModel o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
