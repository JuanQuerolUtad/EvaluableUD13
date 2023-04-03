package dibujarFigurasJuanQuerol;

import java.util.ArrayList;


public class Pantalla {
	private ArrayList<Figura>figuras;
	public Pantalla() {
		super();
		this.figuras = new ArrayList<>();
	}
	
	public void añade_Figura(Figura f) {
		figuras.add(f);
	}
	public void modificar_Figura(char c) {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).setCaracter(c);
		}
	}
	public void lista_Figura() {
		for (int i = 0; i < figuras.size(); i++) {
			
			System.out.println(figuras.get(i).Nombre());
		}
	}
	public void area_Figura() {
		int suma = 0;
		for (int i = 0; i < figuras.size(); i++) {
			suma = suma+figuras.get(i).Area();
		}
		System.out.println(suma);
	}
	public void muestra_Figura() {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).Dibujar();
			
		}
	}
	
	
}
