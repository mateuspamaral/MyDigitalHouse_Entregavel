package br.com.digitalhouse;

import java.util.Objects;

public class Aluno {
    //Attributes
    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

    //Constructors
    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    public Aluno() {
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codigoAluno = codAluno;
    }

    //Overriders
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getCodigoAluno().equals(aluno.getCodigoAluno());
    }
}
