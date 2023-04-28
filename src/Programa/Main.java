package Programa;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso de js");
		curso2.setDescricao("descrição curso javaScript");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Developer");
		bootcamp.setDescricao("Descrição do Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.increverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos connluídos João: " + devJoao.getConteudosConcluidos());
		
		System.out.println("XP: "+ devJoao.calcularTotalXp());
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println();

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.increverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos connluídos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: "+ devCamila.calcularTotalXp());


		
	}

}
