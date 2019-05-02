package br.com.digitalhouse;

import java.util.Date;

public class Matricula {
    //Attributes
    private Aluno aluno;
    private Curso curso;
    private Date data;

    //Constructors
    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = new Date();
    }

    public Matricula() {
    }

}
