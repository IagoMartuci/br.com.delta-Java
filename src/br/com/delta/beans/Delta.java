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

	public void retornarDelta(float resultadoDelta, boolean deltaNegativo) {
		JOptionPane.showMessageDialog(null, "Delta = " + resultadoDelta
				+ "\nDelta negativo? " + deltaNegativo);
	}

}
