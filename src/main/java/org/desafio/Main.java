package org.desafio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      Curso curso1 = new Curso();
      curso1.setTitulo("Spring Boot");
      curso1.setDescricao("Framework Java");
      curso1.setCargaHoraria(100);

      Curso curso2 = new Curso();
      curso2.setTitulo("Angular");
      curso2.setDescricao("Angular descrição");
      curso2.setCargaHoraria(100);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Mentoria java descrição");
      mentoria.setData(LocalDate.now());

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Java");
      bootcamp.setDescricao("Bootcamp Java...");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      System.out.println("Conteúdos do Bootcamp: " + bootcamp.getConteudos());

      Dev dev = new Dev();
      dev.setNome("José");
      dev.inscreverBootcamp(bootcamp);
      System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
      dev.progredir();
      dev.progredir();
      System.out.println("Conteúdos Concluidos " + dev.getNome() + ": " + dev.getConteudosConcluidos());
      dev.calcularTotalXp();
      System.out.println("XP: " + dev.calcularTotalXp());
    }
}
