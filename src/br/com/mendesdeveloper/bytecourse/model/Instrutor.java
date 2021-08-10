package br.com.mendesdeveloper.bytecourse.model;

import java.util.*;

public class Instrutor {

    private String nome;
    private String curriculo;
    private String cpf;
    private Collection<Disciplina> disciplinasLecionadas;
    private int totalDeDisciplinasLecionadas;

    public Instrutor(String nome, String cpf){
        if(nome == null || cpf == null){
            throw new NullPointerException("Nome e CPF não podem ser nulos!");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.disciplinasLecionadas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public Collection<Disciplina> getDisciplinasLecionadas() {
        return Collections.unmodifiableCollection(disciplinasLecionadas);
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrutor instrutor = (Instrutor) o;
        return Objects.equals(nome, instrutor.nome) && Objects.equals(curriculo, instrutor.curriculo) && Objects.equals(cpf, instrutor.cpf) && Objects.equals(disciplinasLecionadas, instrutor.disciplinasLecionadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curriculo, cpf, disciplinasLecionadas);
    }

    public void lecionar(Disciplina programacao) {
        this.disciplinasLecionadas.add(programacao);
        this.totalDeDisciplinasLecionadas++;
    }

    public int getTotalDeDisciplinasLecionadas() {
        return totalDeDisciplinasLecionadas;
    }
}
