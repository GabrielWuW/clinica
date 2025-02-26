/*
 * PROGRAMADOR: Gabriel
 * DATA: 26/02/2025
 * EMPRESA: SENAI
 */

package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	private String nome;
	public LocalDate dataNascimento;
	public int peso;
	private double altura;
	public String telefone;
	private double imc;
	
	public void setNome(String nome) {
		if(nome.trim().length() >= 3) {
			this.nome = nome.toUpperCase();
		} else {
			System.out.println("O nome " + nome.trim() + ", não é valido!\nO nome deve conter pelo menos 3 caracteres!");
		}
	}
	
	public void setAltura(double altura) {
		if(altura >= 0) {
			this.altura = altura;
		} else {
			System.out.println("A altura do(a) paciente " + nome + " deve ser um número positivo!");
		}
	}
	
	
	
	public void calcularIdade() {
		
	}
	
	private double calcularImc() {
		imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("==========================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("==========================");
		System.out.println("NOME: " + nome);
		System.out.println("PESO: " + peso + "Kg");
		System.out.println("ALTURA: " + altura + "M");
		System.out.println("IMC: " + String.format("%.2f", calcularImc()));
		System.out.println("TELEFONE :" + telefone);
		System.out.println("==========================");
	}

}
