package br.com.digitalhouse;

public class ProfessorTitular extends Professor {
    //Attributes
    private String especialidade;

    //Constructors
    public ProfessorTitular(String nome, String sobrenome, Integer tempoCasa, Integer codProfessor, String especialidade) {
        super(nome, sobrenome, tempoCasa, codProfessor);
        this.especialidade = especialidade;
    }

    public ProfessorTitular(){

    }

    //Getters & Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
