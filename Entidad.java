import javax.swing.JOptionPane;

public class Entidad {

	private double ladoA;
	private double ladoB;
	
	public void ingresarDatos() {
		String cadena;
		
		cadena= JOptionPane.showInputDialog(null, "ingresa la longiud del ladoA: ");
		ladoA=Double.parseDouble(cadena);
		
		cadena= JOptionPane.showInputDialog(null, "ingresa la longiud del ladoB: ");
		ladoB=Double.parseDouble(cadena);

		
	}

	public void calucularArea() {
		double resultado;
		
		resultado=ladoA*ladoB;
		
		JOptionPane.showInputDialog(null,"el resultado es:"+resultado);
		
		
	}
	
	
}
