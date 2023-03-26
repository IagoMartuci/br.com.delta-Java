package br.com.delta.teste;

import javax.swing.JOptionPane;
import br.com.delta.beans.Delta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcularDelta();
	}

	public static void CalcularDelta() {

		Delta delta = new Delta();

		delta.setA(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de 'A' para calcular o Delta")));
		delta.setB(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de 'B' para calcular o Delta")));
		delta.setC(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de 'C' para calcular o Delta")));

		// Fórmula Delta: Δ = b² – 4.a.c
		// Teste 1: a = 1, b = – 1 e c = –30 -> Delta = 121
		// Teste 2: a = 2, b = 8 e c = –24 -> Delta = 256
		// Teste 3: a = 4, b = 2 e c = –6 -> Delta = 100
		// Teste 4: a = 7, b = 3 e c = 4 -> Delta = -103
		// Teste 5: a = 0.25, b = 5 e c = 9 -> Delta = 16
		float resultadoDelta = (delta.getB() * delta.getB()) - 4 * delta.getA() * delta.getC();

		delta.RetornarDelta(resultadoDelta, VerificarDeltaNegativo(resultadoDelta));
	}

	public static boolean VerificarDeltaNegativo(float resultadoDelta) {

		boolean deltaNegativo;

		if (resultadoDelta < 0)
			deltaNegativo = true;
		else
			deltaNegativo = false;

		return deltaNegativo;
	}
}
