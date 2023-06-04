import javax.swing.JOptionPane;

public class Secuencial {
	
	/*vamos a conseuir el area de la gramilla usando la formula del area de rectangulo
	 * areaRectangulo = ladoA * ladoB
	 */

	public static void main(String[] args) {
		
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		cadena=JOptionPane.showInputDialog(null,"ingresa la lonitud del lado A:");
		ladoA=Double.parseDouble(cadena);
		
		cadena= JOptionPane.showInputDialog(null,"ingresa la longitud del lado B:");
		ladoB=Double.parseDouble(cadena);
		
		resultado = ladoA*ladoB;
		JOptionPane.showMessageDialog(null, "el resultado es: "+resultado);
		
	}

}
