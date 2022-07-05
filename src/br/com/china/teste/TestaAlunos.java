package br.com.china.teste;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Wesley Matheus");
        alunos.add("Wesley Farias");
        alunos.add("Maria Fernanda");
        alunos.add("Wesley Silva");

        int quantidade = alunos.size();
        System.out.println(quantidade);
        System.out.println(alunos);
        alunos.forEach(System.out::println);
    }
}
