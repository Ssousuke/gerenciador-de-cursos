package br.com.china.teste;

import br.com.china.modelo.Aula;
import br.com.china.modelo.Curso;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Entendendo LinkedList", 19));
        javaColecoes.adiciona(new Aula("Interface List", 25));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 13));

        // System.out.println(javaColecoes.getAula());
        javaColecoes.getAula().forEach(System.out::println);
    }
}
