package implementacion.view;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class View {
	private JOptionPane jpane;

	public View() {
		jpane = new JOptionPane();
	}

	public JOptionPane getJpane() {
		return jpane;
	}

	public void setJpane(JOptionPane jpane) {
		this.jpane = jpane;
	}

	public double getValueFromUser(String valor) throws Exception {
		try {
			return Integer.parseInt(getJpane().showInputDialog(valor));
		} catch (HeadlessException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error en el "
					+ "ingreso de datos (" + e.getMessage() + ")");
			throw new Exception("Error capturando datos");
		}
	}

	public void displayMessage(String message) {
		getJpane().showMessageDialog(null, message);
	}

}
