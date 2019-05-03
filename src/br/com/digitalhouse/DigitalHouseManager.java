package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    //Attributes
    private List<Aluno> alunoList = new ArrayList<>();
    private List<Professor> professorList = new ArrayList<>();
    private List<Curso> cursoList = new ArrayList<>();
    private List<Matricula> matriculaList = new ArrayList<>();

    //Constructors
    public DigitalHouseManager(List<Aluno> alunoList, List<Professor> professorList, List<Curso> cursoList, List<Matricula> matriculaList) {
        this.alunoList = alunoList;
        this.professorList = professorList;
        this.cursoList = cursoList;
        this.matriculaList = matriculaList;
    }

    public DigitalHouseManager() {
    }

    //Getters & Setters
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    //Methods
    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso novoCurso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        cursoList.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso) {
        cursoList.removeIf(curso -> curso.getCodigoCurso().equals(codigoCurso));
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras);
        professorList.add(novoProfessorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade);
        professorList.add(novoProfessorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        professorList.removeIf(professor -> professor.getCodProfessor().equals(codigoProfessor));
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoAluno);
        alunoList.add(novoAluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        Aluno aluno = new Aluno();
        Curso curso = new Curso();

        for (Aluno obj : alunoList) {
            if (obj.getCodAluno().equals(codigoAluno)) {
                aluno = obj;
            }
        }

        for (Curso obj : cursoList) {
            if (obj.getCodigoCurso().equals(codigoCurso)) {
                curso = obj;
            }
        }

        if (curso.adicionarUmAluno(aluno)) {
            Matricula matricula = new Matricula(aluno, curso);
            matriculaList.add(matricula);
            System.out.println("Matrícula do(a) aluno(a) " + aluno.getNome() + " " + aluno.getSobrenome() + " realizada com sucesso!");
        } else {
            System.out.println("O curso está sem vagas, a matrícula do(a) aluno(a) " + aluno.getNome() + " " + aluno.getSobrenome() + "não pode ser realizada.");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        ProfessorTitular professorTitular = new ProfessorTitular();
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();

        for (Professor professor : professorList){
            if (professor.getCodProfessor().equals(codigoProfessorTitular)){
                professorTitular = (ProfessorTitular) professor;
            } else if (professor.getCodProfessor().equals(codigoProfessorAdjunto)){
                professorAdjunto = (ProfessorAdjunto) professor;
            }
        }

        for (Curso curso : cursoList){
            if (curso.getCodigoCurso().equals(codigoCurso)){
                curso.setProfessorTitular(professorTitular);
                curso.setProfessorAdjunto(professorAdjunto);
            }
        }
    }
}
