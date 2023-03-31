package dibujarFigurasJuanQuerol;

public class Triangulo implements Figura{
	private int lado;
	private String tipo;
	private char caracter;
	
	
	public Triangulo(int lado, String tipo, char caracter) {
		super();
		this.lado = lado;
		this.tipo = tipo;
		this.caracter = caracter;
	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Triangulo tipo " + tipo + " lado " + lado;
	}

	@Override
	public void Dibujar() {
		if (tipo.equalsIgnoreCase("a")) {
			for (int i = lado+1; i > 0; i--) {
				for (int j = 0; j < lado; j++) {
					System.out.print(caracter);
				}
			}
		}
		else if (tipo.equalsIgnoreCase("b")) {
			for (int i = lado+1; i > 0; i++) {
				for (int j = 0; j < lado; j++) {
					if (j<lado) {
						System.out.print(" ");
					}else {
						System.out.print(caracter);
					}
				}
			}
		}
		else if (tipo.equalsIgnoreCase("c")) {
			for (int i = 0; i < lado; i++) {
				for (int j = 0; j < (i+1); j++) {
					System.out.print(caracter);
				}
			}
		}
		else if (tipo.equalsIgnoreCase("d")) {
			for (int i = 0; i < lado; i++) {
				for (int j = 0; j < lado; j++) {
					if (j<lado) {
						System.out.print(" ");
					}else {
						System.out.print(caracter);
					}
				}
			}
		} 
		else {
			System.out.println("no existe ese tipo");
		}
		
	}

	@Override
	public int Area() {
		return (lado*lado)/2;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCaracter(char c) {
		this.caracter=c;
		
	}

	@Override
	public char getCaracter() {
		// TODO Auto-generated method stub
		return caracter;
	}

}
