package br.com.china.teste;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String aula1 = "Trabalhando com listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        // aulas.forEach(x -> System.out.println(x));
        // Aqui, você realmente não precisa do nome x para invocar println cada um dos
        // elementos. É aí que a referência do método é útil - o ::operador indica que você
        // invocará o println método com um parâmetro, cujo nome você não especifica explicitamente:
        aulas.forEach(System.out::println);

        System.out.println(aulas);
        aulas.add("Adicionando uma nova String");
        Collections.sort(aulas);

        aulas.forEach(System.out::println);
    }
}