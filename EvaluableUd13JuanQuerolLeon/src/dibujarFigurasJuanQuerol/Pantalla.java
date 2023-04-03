package dibujarFigurasJuanQuerol;

import java.util.ArrayList;


public class Pantalla {
	private ArrayList<Figura>figuras;
	public Pantalla() {
		super();
		this.figuras = new ArrayList<>();
	}
	
	public void añade_Figura(Figura f) {
		//añade una figura al array
		figuras.add(f);
	}
	
	public void modificar_Figura(char c) {
		//modifica el caracter a todas las figuras que estan en el array
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).setCaracter(c);
		}
	}
	
	public void lista_Figura() {
		//muestra los datos de las figuras que estan en el array
		for (int i = 0; i < figuras.size(); i++) {
			
			System.out.println(figuras.get(i).Nombre());
		}
	}
	
	public void area_Figura() {
		//hace una suma total de toso los areas
		int suma = 0;
		for (int i = 0; i < figuras.size(); i++) {
			suma = suma+figuras.get(i).Area();
		}
		System.out.println(suma);
	}
	public void muestra_Figura() {
		//dibuja las figuras del array
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).Dibujar();
			
		}
	}
	
	
}
