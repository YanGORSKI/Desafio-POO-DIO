package br.dio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("descricao curso javaScript");
		curso2.setCargaHoraria(6);
		
		Conteudo curso3 = new Curso();
		Conteudo mentoria2 = new Mentoria();
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição Mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devYan = new Dev();
		devYan.setNome("Yan");
		devYan.inscreverBootcamp(bootcamp);
		System.out.println(devYan.getConteudosInscritos());
		System.out.println(devYan.getConteudosConcluidos());
		System.out.println("XP: " + devYan.calcularTotalXp());
		devYan.progredir();
		System.out.println(devYan.getConteudosInscritos());
		System.out.println(devYan.getConteudosConcluidos());
		System.out.println("XP: " + devYan.calcularTotalXp());
		devYan.progredir();
		System.out.println(devYan.getConteudosInscritos());
		System.out.println(devYan.getConteudosConcluidos());
		System.out.println("XP: " + devYan.calcularTotalXp());
		
		Dev devJoao =new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println(devJoao.getConteudosInscritos());
		System.out.println(devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		devJoao.progredir();
		System.out.println(devJoao.getConteudosInscritos());
		System.out.println(devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());		
		
		
		
	}

}
