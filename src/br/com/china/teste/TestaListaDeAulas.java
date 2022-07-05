package br.com.china.teste;

import br.com.china.modelo.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Testando Listas de Aulas", 11);
        Aula aula2 = new Aula("Listas de objetos", 22);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
        Aula aula4 = new Aula("Adicionando uma nova aula", 30);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        aulas.forEach(System.out::println);

        // Ordenando a lista em ordem alfabetica
        Collections.sort(aulas);
        System.out.println();

        aulas.forEach(System.out::println);

        // Ordenando a lista pelo tempo
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println();

        aulas.forEach(System.out::println);

    }
}
