package SistemaAcademico.src;

import SistemaAcademico.model.Aluno;
import SistemaAcademico.model.Disciplina;
import SistemaAcademico.model.Matricula;
import SistemaAcademico.service.SistemaService;


public class main {
    static void main(String[] args) {
        SistemaService sistema = new SistemaService();
        Aluno a1 = new Aluno(1, "Joe", "202321");
        Disciplina d1 = new Disciplina(1, "Joe", 80);

         sistema.cadastrarAluno(a1);
         sistema.cadastrarDisciplina(d1);

         sistema.matricularAluno(a1, d1);
        Matricula m = sistema.getMatriculas().get(0);
        m.setNota1(6);
        m.setNota2(7);

        System.out.println(m);
    }
}
