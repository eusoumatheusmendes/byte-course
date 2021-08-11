package br.com.mendesdeveloper.bytecourse.test;

import br.com.mendesdeveloper.bytecourse.model.*;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso si = new Curso("Sistemas de Informaçao");

        Aluno juliana = new Aluno("Juliana", "000000000", 120987);
        Aluno pedro = new Aluno("Pedro", "00050000", 120987);
        Aluno paulo = new Aluno("Paulo", "0004850000", 120987);
        Aluno maria = new Aluno("Maria", "0004850000", 120987);

        Instrutor instrutor1 = new Instrutor("Joao", "0845654444");
        Disciplina programacao = new Disciplina("Programação 3", 2);
        Disciplina programacao4 = new Disciplina("Programação 4", 2);

        instrutor1.lecionar(programacao);
        instrutor1.lecionar(programacao4);

        Instrutor instrutor2 = new Instrutor("Marilu", "47656555");
        Disciplina engenhariaSoftware = new Disciplina("Engenharia Software 3", 3);
        Disciplina bd = new Disciplina("BD", 3);

        instrutor2.lecionar(engenhariaSoftware);
        //instrutor2.lecionar(bd);

        si.matricular(juliana);
        si.matricular(pedro);
        si.matricular(paulo);
        System.out.println("EXISTE ESSE ALUNO?" +si.existeAluno(maria));

        si.ofertar(programacao);
        si.ofertar(programacao4);

        CalculadoraDePagamentosDoInstrutor calc = new CalculadoraDePagamentosDoInstrutor();
        calc.calcularPagamento(instrutor2);

        System.out.println("Total pagamento: " +calc.getGetTotalPagamento());


        System.out.println("Duração do curso: " +si.getDuracao());

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
