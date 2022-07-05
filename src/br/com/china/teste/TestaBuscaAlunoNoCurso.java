package br.com.china.teste;

import br.com.china.modelo.Aluno;
import br.com.china.modelo.Aula;
import br.com.china.modelo.Curso;

public class TestaBuscaAlunoNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Entendendo LinkedList", 19));
        javaColecoes.adiciona(new Aula("Interface List", 25));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 13));


        Aluno aluno = new Aluno("Wesley Farias", "10000");
        Aluno aluno1 = new Aluno("Wesley Matheus", "10001");
        Aluno aluno2 = new Aluno("Wesley Silva", "10002");

        javaColecoes.matricula(aluno);
        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);

        javaColecoes.estaMatriculado(aluno);
        Aluno a1 = javaColecoes.buscaMatriculado("10001");
        System.out.println("Aluno : " + a1);
    }
}
