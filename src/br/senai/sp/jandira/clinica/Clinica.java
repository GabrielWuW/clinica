package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		// Criando o objeto paciente
		Paciente p1 = new Paciente();
		p1.setNome("Jó da Silva");
		p1.setAltura(1.65);
		p1.peso = 51;
		p1.telefone = "(11)99999-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		
		Paciente p2 = new Paciente();
		p2.setNome("Gabriel José");
		p2.setAltura(1.76);
		p2.peso = 72;
		p2.telefone = "(11)4002-8922";
		p2.dataNascimento = LocalDate.of(2007, 7, 6);
		
		//Exibindo a referencia dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);
		
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
	}

}
