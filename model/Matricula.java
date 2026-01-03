package SistemaAcademico.model;

import SistemaAcademico.exception.RegraNegocioException;
import SistemaAcademico.util.Validador;

public class Matricula {

    private Aluno aluno;
    private Disciplina disciplina;
    private Double nota1;
    private Double nota2;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        if (aluno == null || disciplina == null) {
            throw new RegraNegocioException(
                    "Aluno e disciplina são obrigatórios para matrícula."
            );
        }
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public void setNota1(double nota) {
        Validador.validarNota(nota);
        this.nota1 = nota;
    }

    public void setNota2(double nota) {
        Validador.validarNota(nota);
        this.nota2 = nota;
    }

    public double calcularMedia() {
        if (nota1 == null || nota2 == null) {
            throw new RegraNegocioException(
                    "As duas notas devem ser lançadas antes de calcular a média."
            );
        }
        return (nota1 + nota2) / 2;
    }

    public String verificarStatus() {
        double media = calcularMedia();

        if (media >= 7) return "APROVADO";
        if (media >= 5) return "EXAME";
        return "REPROVADO";
    }

    public Aluno getAluno() {
        return aluno;
    }

    @Override
    public String toString() {
        return aluno.getNome() +
                " | " + disciplina.getNome() +
                " | Média: " + String.format("%.2f", calcularMedia()) +
                " | Status: " + verificarStatus();
    }
}