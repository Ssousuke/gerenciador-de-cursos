package br.com.china.teste;

import br.com.china.modelo.Aula;
import br.com.china.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Entendendo LinkedList", 19));
        javaColecoes.adiciona(new Aula("Interface List", 25));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 13));

        List<Aula> aulasImutaveis = javaColecoes.getAula();
        System.out.println(aulasImutaveis);

        System.out.println();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println("Tempo Total: " + javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
