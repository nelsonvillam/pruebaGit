package implementacion;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalez
 */
public class Ingreso extends OperacionesMatematicas {

	private Organiza miOrganiza;
	private double mayor, menor;

	public Ingreso() {
		this.miOrganiza = new Organiza();
	}

	/**
	 * Permite el ingreso de 2 numeros enteros para el posterior calculo de su
	 * division
	 */
	public void ingresar() {
		try {
			double numero1 = Integer.parseInt(JOptionPane.showInputDialog("valor1: "));
			double numero2 = Integer.parseInt(JOptionPane.showInputDialog("valor2: "));
			/**
			 * Usa miOrganiza para obtener el mayor
			 */
			mayor = this.miOrganiza.calculaMayor(numero1, numero2);
			/**
			 * Usa miOrganiza para obtener el menor
			 */
			menor = this.miOrganiza.calculaMenor(numero1, numero2);

			JOptionPane.showMessageDialog(null,
					"La division entre:" + "" + mayor + "/" + menor + " =  " + dividir(mayor, menor));

		} catch (HeadlessException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error en el ingreso de datos (" + e.getMessage() + ")");
		}
	}
}
