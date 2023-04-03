package dibujarFigurasJuanQuerol;

import java.util.Scanner;

public class DibujarPantalla {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String opcion = "";
		Pantalla p1 = new Pantalla();
		while (!opcion.equalsIgnoreCase("f")) {
			menuImprimir();
			opcion = sc.next();
			menu(opcion, p1);
		}
	}
	public static void menu(String opcion, Pantalla p1) {
		if (opcion.equalsIgnoreCase("a")) {
			Añadir(p1);
		}else if(opcion.equalsIgnoreCase("b")){
			System.out.print("Indique el nuevo carácter para las figuras: ");
			char caracter = sc.next().charAt(0);
			p1.modificar_Figura(caracter);
		}else if(opcion.equalsIgnoreCase("c")){
			System.out.println("Las figuras que has añadido son: ");
			System.out.println(" ");
			p1.muestra_Figura();
		}else if(opcion.equalsIgnoreCase("d")){
			System.out.print("El área total de la pantalla es: ");
			p1.area_Figura();
		}else if(opcion.equalsIgnoreCase("e")){
			System.out.println("El listado de las figuras añadidas son:");
			p1.lista_Figura();
		}else if(opcion.equalsIgnoreCase("f")){
			System.out.println("Gracias por utilizar el programa");
		}else {
			System.out.println("Opción no válida, vuelva a intentarlo");
		}
	}
	public static void menuImprimir() {
		System.out.println(" ");
		System.out.println("Seleccione una opción: [a-f]");
		System.out.println("a - Añadir una figura");
		System.out.println("b - Modificar una figura");
		System.out.println("c - Mostrar la pantalla");
		System.out.println("d - Área de la pantalla");
		System.out.println("e - Listar Figuras");
		System.out.println("f - Salir");
	}
	public static void Añadir(Pantalla p1) {
		String eleccionFigura = "";
		while (!eleccionFigura.equalsIgnoreCase("r") && !eleccionFigura.equalsIgnoreCase("t") ) {
			System.out.println("¿Rectángulo (r) o Triángulo (t)?");
			eleccionFigura = sc.next();
			if (eleccionFigura.equalsIgnoreCase("r")) {
				System.out.print("Indica la base: ");
				int base = sc.nextInt(); 
				System.out.print("Indica la altura: ");
				int altura = sc.nextInt();
				System.out.print("Indica el caracter: ");
				char caracter = sc.next().charAt(0);
				p1.añade_Figura(new Rectangulo(base, altura, caracter));
			}else if (eleccionFigura.equalsIgnoreCase("t")) {
				System.out.print("Indica el lado: ");
				int base = sc.nextInt(); 
				System.out.print("Indica el tipo (a,b,c,d): ");
				String tipo = sc.next();
				System.out.print("Indica el caracter: ");
				char caracter = sc.next().charAt(0);
				p1.añade_Figura(new Triangulo(base, tipo, caracter));
			}else {
				System.out.println("Opción no válida, vuelva a intentarlo");
			}
		}
	}

}
