import javax.swing.JOptionPane;

//aplicacion usando una clase y metodos

public class Aplicacio {

	//se crea una clase principal
	public static void main(String[] args) {
		
		double ladoA;
		double ladoB;
		
		//se inicializan las variables y metodos
		ladoA = ingresarDatos("ingresa la longitud del lado A: ");
		ladoB = ingresarDatos("ingresa la longitud del lado B: ");
		
		calcularArea (ladoA, ladoB);


	}

	//creacion de metodo ingresarDatos con parametro
	public static double ingresarDatos( String mensaje) {
		
		//se crean las variables
		String cadena;
		double valor;
		
		cadena=JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);
		
		return valor;
	}
	
	
	public static void calcularArea(double a, double b) {
		double resultado;
		
		resultado= a*b;
		
		JOptionPane.showInputDialog(null,"el resultado es: "+resultado);
		
		
	}
	

}//fin de la aplicacion
