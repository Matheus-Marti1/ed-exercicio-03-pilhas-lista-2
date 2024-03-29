package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		boolean opc = false;
		while (!opc) {
			int valor = Integer
					.parseInt(JOptionPane.showInputDialog("Insira um número de 0 a 10 para calcular o fatorial:"));
			if (valor >= 1 && valor <= 10) {
				opc = true;
				FatController fatC = new FatController();
				int fat = fatC.fatorial(valor);
				System.out.println("Fatorial de " + valor + ": " + fat);
			} else if (valor == 0) {
				opc = true;
				System.out.println("Fatorial de 0: 1");
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido. Insira novamente.");
			}

		}
	}
}
