package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {
    //Attributes
    private Integer qntHorasMonitoria;

    //Constructor
    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoCasa, Integer codProfessor, Integer qntHorasMonitoria) {
        super(nome, sobrenome, tempoCasa, codProfessor);
        this.qntHorasMonitoria = qntHorasMonitoria;
    }

    public ProfessorAdjunto(){

    }

    //Getters & Setters
    public Integer getQntHorasMonitoria() {
        return qntHorasMonitoria;
    }

    public void setQntHorasMonitoria(Integer qntHorasMonitoria) {
        this.qntHorasMonitoria = qntHorasMonitoria;
    }
}
