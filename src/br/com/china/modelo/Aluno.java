package br.com.china.modelo;

public class Aluno {
    private String nome;
    private String numeroDaMatricula;

    public Aluno(String nome, String nomeroDaMatricula) {
        this.nome = nome;
        this.numeroDaMatricula = nomeroDaMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDaMatricula() {
        return numeroDaMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.numeroDaMatricula.equals(aluno.numeroDaMatricula);
        // return this.numeroDaMatricula.equals(((Aluno) obj).numeroDaMatricula);

    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Matrícula: " + this.numeroDaMatricula;
    }
}
