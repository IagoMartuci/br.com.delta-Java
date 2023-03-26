package br.com.delta.beans;

import javax.swing.JOptionPane;

public class Delta {
	private float a;
	private float b;
	private float c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public void RetornarDelta(float resultadoDelta, boolean deltaNegativo) {
		JOptionPane.showMessageDialog(null,
				"Resultado do cálculo: %.2f \nDelta negativo? %b".formatted(resultadoDelta, deltaNegativo)); // Java 15+
		JOptionPane.showMessageDialog(null, 
				String.format("Resultado do cálculo: %.2f \nDelta negativo? %b", resultadoDelta, deltaNegativo)); // Java 15-
		// Interpolação de strings:
		// https://pt.stackoverflow.com/questions/512957/h%C3%A1-como-interpolar-strings-em-java
	}

}
