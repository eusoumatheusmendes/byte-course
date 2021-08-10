package br.com.mendesdeveloper.bytecourse.model;

import br.com.mendesdeveloper.bytecourse.services.Remuneravel;

public class CalculadoraDePagamentosDoInstrutor {

    private double getTotalPagamento;

    public void calcularPagamento(Remuneravel remuneravel){
        this.getTotalPagamento += remuneravel.getSalario();
    }

    public double getGetTotalPagamento() {
        return getTotalPagamento;
    }
}
