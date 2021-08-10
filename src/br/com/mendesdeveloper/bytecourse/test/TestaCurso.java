package br.com.mendesdeveloper.bytecourse.test;

import br.com.mendesdeveloper.bytecourse.model.Aluno;
import br.com.mendesdeveloper.bytecourse.model.Curso;

public class TestaCurso {

    public static void main(String[] args) {

        Curso si = new Curso("Sistemas de Informaçao", 4);
        Aluno aluno = new Aluno("Juliana", "000000000", 120987);
        si.matricular(aluno);

    }
}
