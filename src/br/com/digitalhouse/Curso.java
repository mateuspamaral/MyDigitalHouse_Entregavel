package br.com.digitalhouse;

import java.util.List;

public class Curso {
    //Attributes
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaDeAlunos;
    private List<Aluno> alunoList;

    //Constructors
    public Curso(String nome, Integer codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer quantidadeMaximaDeAlunos, List<Aluno> alunoList) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        this.alunoList = alunoList;
    }
    
    public Curso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public Curso() {
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    //Overriders
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return getCodigoCurso().equals(curso.getCodigoCurso());
    }

    //Methods
    public Boolean adicionarUmAluno(Aluno umAluno){
        Integer qntAlunos = this.alunoList.size();
        qntAlunos++;
        if (qntAlunos <= getQuantidadeMaximaDeAlunos()){
            this.alunoList.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        this.alunoList.remove(umAluno);
    }
}
