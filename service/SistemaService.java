package SistemaAcademico.service;


import SistemaAcademico.model.Aluno;
import SistemaAcademico.model.Disciplina;
import SistemaAcademico.model.Matricula;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SistemaService {
private List<Aluno> alunos = new ArrayList<>();
private List<Disciplina> disciplinas = new ArrayList<>();
private List<Matricula> matriculas = new ArrayList<>();

private Scanner sc = new Scanner(System.in);

    public void cadastrarAluno() {
        System.out.print("ID do aluno: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        alunos.add(new Aluno(id, nome, matricula));
        System.out.println("✅ Aluno cadastrado com sucesso!");
    }
    public void cadastrarDisciplina() {
        System.out.print("ID da disciplina: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome da disciplina: ");
        String nome = sc.nextLine();

        System.out.print("Carga horária: ");
        int carga = sc.nextInt();

        disciplinas.add(new Disciplina(id, nome, carga));
        System.out.println("✅ Disciplina cadastrada com sucesso!");
    }
public void matricularAluno(Aluno aluno, Disciplina disciplina){
     Matricula matricula = new Matricula(aluno, disciplina);
     matriculas.add(matricula);

}
    public void matricularAluno() {
        System.out.print("ID do aluno: ");
        int idAluno = sc.nextInt();

        System.out.print("ID da disciplina: ");
        int idDisciplina = sc.nextInt();

        Aluno aluno = buscarAlunoPorId(idAluno);
        Disciplina disciplina = buscarDisciplinaPorId(idDisciplina);

        if (aluno == null || disciplina == null) {
            System.out.println("❌ Aluno ou disciplina não encontrados.");
            return;
        }

        matriculas.add(new Matricula(aluno, disciplina));
        System.out.println("✅ Matrícula realizada com sucesso!");
    }

    public void lancarNotas() {
        System.out.print("ID do aluno: ");
        int idAluno = sc.nextInt();

        for (Matricula m : matriculas) {
            if (m.getAluno().getId() == idAluno) {
                System.out.print("Nota 1: ");
                m.setNota1(sc.nextDouble());

                System.out.print("Nota 2: ");
                m.setNota2(sc.nextDouble());

                System.out.println("✅ Notas lançadas!");
                return;
            }
        }

        System.out.println("❌ Matrícula não encontrada.");
    }

    public void listarMatriculas() {
        if (matriculas.isEmpty()) {
            System.out.println("Nenhuma matrícula encontrada.");
            return;
        }

        for (Matricula m : matriculas) {
            System.out.println(m);
        }
    }

    private Aluno buscarAlunoPorId(int id) {
        for (Aluno a : alunos) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    private Disciplina buscarDisciplinaPorId(int id) {
        for (Disciplina d : disciplinas) {
            if (d.getId() == id) return d;
        }
        return null;
    }
}