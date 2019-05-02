package br.com.digitalhouse;

import java.util.Objects;

public abstract class Professor {
    //Attributes
    protected String nome;
    protected String sobrenome;
    protected Integer tempoCasa;
    protected Integer codProfessor;

    //Constructors
    public Professor(String nome, String sobrenome, Integer tempoCasa, Integer codProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codProfessor = codProfessor;
    }

    public Professor() {
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

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }

    //Overriders
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(getCodProfessor(), professor.getCodProfessor());
    }

}
