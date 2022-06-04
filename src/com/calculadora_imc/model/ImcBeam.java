package com.calculadora_imc.model;

import java.text.DecimalFormat;

public class ImcBeam {

	private float peso;
	private float altura;

	public ImcBeam() {

	}

	public ImcBeam(String peso, String altura) {
		this.setPeso(peso);
		setAltura(altura);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+") == false ? 0f : Float.parseFloat(peso));
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+") == false ? 0f : Float.parseFloat(altura));
	}

	public String getResult() {
		Float imc = peso / (altura * 2);
		StringBuilder result = new StringBuilder("IMC = " + new DecimalFormat("#.## ").format(peso / (altura * 2)) + "\n");
		if (imc.isNaN()) {
			return "Valores Inválidos, insira apenas numeros.";
		}
		if (imc < 18.5) {
			result.append("Você está muito abaixo do peso");
		} else if (imc <= 24.9) {
			result.append("Peso normal");
		} else if (imc <= 29.9) {
			result.append("Sobrepeso");
		} else if (imc <= 34.9) {
			result.append("Obesidade Grau I");
		} else if (imc <= 39.9) {
			result.append("Obesidade Grau II");
		} else {
			result.append("Obesidade Morbida!!");
		}
		return result.toString();

	}

	@Override
	public String toString() {
		return "ImcBeam [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}

}
