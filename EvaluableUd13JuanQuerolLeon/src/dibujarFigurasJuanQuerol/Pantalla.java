package dibujarFigurasJuanQuerol;

import java.util.ArrayList;


public class Pantalla {
	private Rectangulo rectangulo;
	private Triangulo triangulo;
	private ArrayList<Figura>figuras;
	public Pantalla(ArrayList<Figura> figuras) {
		super();
		this.figuras = figuras;
	}
	
	public void añade_Figura(Figura f) {
		figuras.add(f);
	}
	public void modificar_Figura(char c) {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).setCaracter(c);
		}
	}
	public void lista_Figura(char c) {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).Nombre();
		}
	}
	public void area_Figura(char c) {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).Area();
		}
	}
	public void muestra_Figura(char c) {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).Dibujar();;
		}
	}
	
	
}
