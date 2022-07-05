package br.com.china.modelo;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Curso {
    private String nome;
    private String instutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<String, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instutor) {
        this.nome = nome;
        this.instutor = instutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstutor() {
        return instutor;
    }

    public List<Aula> getAula() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        AtomicInteger tempoTotal = new AtomicInteger();
        aulas.forEach(aula -> tempoTotal.addAndGet(aula.getTempo()));
        return tempoTotal.get();
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome + ", Tempo total: " + getTempoTotal() + ", Aulas: " + this.aulas;
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroDaMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(String matricula) {
        /*for (Aluno aluno : alunos) {
            // if (aluno.getNumeroDaMatricula() == matricula) {
            if (Objects.equals(aluno.getNumeroDaMatricula(), matricula)) {
                return aluno;
            }
        }
        throw new NoSuchElementException("Matrícula não encontrada: " + matricula);
         */
        return matriculaParaAluno.get(matricula);
    }
}
