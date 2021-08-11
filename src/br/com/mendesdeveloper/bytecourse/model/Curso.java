package br.com.mendesdeveloper.bytecourse.model;

import java.util.*;

public class Curso {

    private String nome;
    private int duracao;
    private Collection<Aluno> alunos;
    private Collection<Disciplina> disciplinas;
    private int totalDeAlunos;

    public Curso(String nome){
        if(nome == null){
            throw new NullPointerException("Curso deve possuir um nome.");
        }
        this.nome = nome;
        this.alunos = new HashSet<>();
        this.disciplinas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return duracao == curso.duracao && Objects.equals(nome, curso.nome) && Objects.equals(alunos, curso.alunos) && Objects.equals(disciplinas, curso.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao, alunos, disciplinas, totalDeAlunos);
    }

    public Collection<Aluno> getAlunos() {
        return Collections.unmodifiableCollection(alunos);
    }

    public Collection<Disciplina> getDisciplinas() {
        return Collections.unmodifiableCollection(disciplinas);
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.totalDeAlunos++;
    }

    public int getTotalDeAlunos() {
        return totalDeAlunos;
    }

    public void ofertar(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

   public int getDuracao(){
     this.disciplinas.forEach(disciplina -> {
         this.duracao += disciplina.getDuracao();
     });
     return this.duracao;
   }

   public boolean existeAluno(Aluno aluno){
        return this.alunos.contains(aluno);
   }
}
