package br.com.mendesdeveloper.bytecourse.model;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String cpf;
    private int matricula;

    public Aluno(String nome, String cpf, int matricula){
        if(nome == null || cpf == null){
            throw new NullPointerException("Nome ou CPF não podem ser nulos!");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", Matrícula: " + this.matricula + " ]";
    }

    @Override
    public boolean equals(Object o) {
        Aluno aluno = (Aluno) o;
        return this.cpf == aluno.cpf || this.matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, matricula);
    }
}
