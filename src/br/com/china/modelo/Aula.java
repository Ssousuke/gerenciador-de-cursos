package br.com.china.modelo;

public class Aula implements Comparable<Aula> {
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getTempo() {
        return this.tempo;
    }

    @Override
    public int compareTo(Aula aula) {
        return this.titulo.compareTo(aula.titulo);
    }


    @Override
    public String toString() {
        return "Aula: " + this.titulo + ", Minutos: " + this.tempo;
    }
}