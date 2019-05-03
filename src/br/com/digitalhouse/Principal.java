package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        //Instantiating
        DigitalHouseManager manager = new DigitalHouseManager();

        //Registrar professores
        manager.registrarProfessorTitular("Mateus", "Amaral", 111, "Full Stack");
        manager.registrarProfessorTitular("Carolina", "Meira", 222, "Android");
        manager.registrarProfessorAdjunto("Fred", "Amaral", 999, 16);
        manager.registrarProfessorAdjunto("Lex","Blank",888,16);

        //Registrar cursos
        manager.registrarCurso("Full Stack",20001,3);
        manager.registrarCurso("Android", 20002,2);

        //Alocar professores
        manager.alocarProfessores(20001,111,999);
        manager.alocarProfessores(20002,222,888);

        //Matricular alunos
        manager.matricularAluno("Jessica", "Correa", 123);
        manager.matricularAluno("Tairo", "Miguel", 321);
        manager.matricularAluno(123,20001);
        manager.matricularAluno(321,20001);

        manager.matricularAluno("João", "Silva", 741);
        manager.matricularAluno("Maria", "Silva", 852);
        manager.matricularAluno("Beth", "Carvalho", 963);
        manager.matricularAluno(741,20002);
        manager.matricularAluno(852,20002);
        manager.matricularAluno(963,20002);
    }
}
