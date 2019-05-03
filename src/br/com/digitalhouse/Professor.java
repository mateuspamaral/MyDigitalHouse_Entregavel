package br.com.digitalhouse;

import java.util.Objects;

public abstract class Professor {
    //Attributes
    private String nome;
    private String sobrenome;
    private Integer tempoCasa;
    private Integer codigoProfessor;

    //Constructors
    public Professor(String nome, String sobrenome, Integer tempoCasa, Integer codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codigoProfessor = codigoProfessor;
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

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codigoProfessor = codProfessor;
    }

    //Overriders
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(getCodigoProfessor(), professor.getCodigoProfessor());
    }

}
