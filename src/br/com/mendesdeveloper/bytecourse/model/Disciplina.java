package br.com.mendesdeveloper.bytecourse.model;

public class Disciplina {

    private String descricao;
    private int duracao;

    public Disciplina(String descricao, int duracao){
        if(descricao == null || duracao <= 0){
            throw new IllegalArgumentException("Entre com uma descrição e duração válida para a disciplina.");
        }
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
