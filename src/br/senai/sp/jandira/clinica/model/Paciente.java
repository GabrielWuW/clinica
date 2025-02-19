package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	public String nome;
	public LocalDate dataNascimento;
	public int peso;
	public double altura;
	public String telefone;
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("==========================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("==========================");
		System.out.println("NOME: " + nome);
		System.out.println("PESO: " + peso);
		System.out.println("ALTURA: " + altura);
		System.out.println("TELEFONE :" + telefone);
		System.out.println("==========================");
		System.out.println();
	}

}
