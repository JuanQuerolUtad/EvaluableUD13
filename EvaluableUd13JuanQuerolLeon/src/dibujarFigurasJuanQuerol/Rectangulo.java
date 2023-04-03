package dibujarFigurasJuanQuerol;

public class Rectangulo implements Figura{
	private int base;
	private int altura;
	private char caracter;
	
	
	public Rectangulo(int base, int altura, char caracter) {
		super();
		this.base = base;
		this.altura = altura;
		this.caracter = caracter;
	}

	@Override
	public String Nombre() {
		//da el nombre de la figura y de los datos
		return "Rectangulo " + base + " X " + altura;
	}

	@Override
	public void Dibujar() {
		//dibuja la figura con el caracter que lean pedido 
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print(caracter);
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
	}

	@Override
	public int Area() {
		//calcula el area del rectangulo con la siguiente formula base x altura
		return base*altura;
		
		
	}

	@Override
	public void setCaracter(char c) {
		this.caracter=c;
		
	}

	@Override
	public char getCaracter() {
		
		return caracter;
	}

}
