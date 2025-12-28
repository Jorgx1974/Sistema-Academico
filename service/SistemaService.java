package SistemaAcademico.service;


import SistemaAcademico.model.Aluno;
import SistemaAcademico.model.Disciplina;
import SistemaAcademico.model.Matricula;

import java.util.ArrayList;
import java.util.List;

public class SistemaService {
private List<Aluno> alunos = new ArrayList<>();
private List<Disciplina> disciplinas = new ArrayList<>();
private List<Matricula> matriculas = new ArrayList<>();

public void cadastrarAluno(Aluno aluno){
    alunos.add(aluno);
}
public void cadastrarDisciplina(Disciplina disciplina){
    disciplinas.add(disciplina);
}
public Aluno buscarAlunoPorId(int id) {
    for (Aluno aluno : alunos) {
        if (aluno.getId() == id) {
            return aluno;
        }
    }

return null;
 }
public void matricularAluno(Aluno aluno, Disciplina disciplina){
     Matricula matricula = new Matricula(aluno, disciplina);
     matriculas.add(matricula);

}
public List<Matricula> getMatriculas() {
    return matriculas;
}
}

