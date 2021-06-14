package com.imcrec.api.model;

import java.text.DecimalFormat;

public class Imc {
	
	private float peso;
	private float altura;
	private String retorno;
	private float imcCalc;
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public float getImcCalc() {
		return imcCalc;
	}

	public void setImcCalc(float imcCalc) {
		this.imcCalc = imcCalc;
	}

	public Imc(float peso, float altura) {
		setPeso(peso);
		setAltura(altura);
	}
	
	public void calculaImc() {
		this.imcCalc = this.getPeso()/(this.getAltura()*this.getAltura());
	}
	
	public String retornaIMC() {
		calculaImc();
		DecimalFormat format = new DecimalFormat("#.##");
		if (imcCalc < 18.5) {
			setRetorno("IMC: " + format.format(imcCalc) + " | Classificação: Abaixo do Peso" + " | Risco: Elevado");
		} else if (imcCalc < 25) {
			setRetorno("IMC: " + format.format(imcCalc) + " | Classificação: Peso ideal" + " | Risco: Inexistente");
		} else if (imcCalc < 30) {
			setRetorno("IMC: " + format.format(imcCalc) + " | Classificação: Excesso de peso" + " | nRisco: Elevado");
		} else if (imcCalc < 35) {
			setRetorno("IMC: " + format.format(imcCalc) + " | Classificação: Obesidade Grau 1" + " | Risco: Muito Elevado");
		} else if (imcCalc < 40) {
			setRetorno("IMC: " + format.format(imcCalc) + " | Classificação: Obesidade Grau 2" + " | Risco: Muitíssimo Elevado");
		} else {
			setRetorno("IMC: " + format.format(imcCalc) + " | Classificação: Obesidade Grau 3" + " | Risco: Obesidade Mórbida");
		}
		return retorno;
	}
}
