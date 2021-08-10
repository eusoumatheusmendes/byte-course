package br.com.mendesdeveloper.bytecourse.test;

import br.com.mendesdeveloper.bytecourse.model.Aluno;
import br.com.mendesdeveloper.bytecourse.model.Curso;
import br.com.mendesdeveloper.bytecourse.model.Disciplina;
import br.com.mendesdeveloper.bytecourse.model.Instrutor;

public class TestaCurso {

    public static void main(String[] args) {

        Curso si = new Curso("Sistemas de Informaçao", 4);

        Aluno juliana = new Aluno("Juliana", "000000000", 120987);
        Aluno pedro = new Aluno("Pedro", "00050000", 120987);
        Aluno paulo = new Aluno("Paulo", "0004850000", 120987);
        Aluno maria = new Aluno("Maria", "0004850000", 120987);

        Instrutor instrutor = new Instrutor("Joao", "0845654444");
        Disciplina programacao = new Disciplina("Programação 3", 2);
        Disciplina programacao4 = new Disciplina("Programação 4", 2);

        instrutor.lecionar(programacao);
        instrutor.lecionar(programacao4);

        si.matricular(juliana);
        si.matricular(pedro);
        si.matricular(paulo);

        si.ofertar(programacao);
        si.ofertar(programacao4);

        System.out.println("Alunos mastriculados no curso de SI: ==================");
        si.getAlunos().forEach(aluno -> {
            System.out.println("Aluno: " +aluno);
        });

        System.out.println("Disciplinas do curso de SI: ==================");
        si.getDisciplinas().forEach(disciplina -> {
            System.out.println(disciplina);
        });


    }
}
