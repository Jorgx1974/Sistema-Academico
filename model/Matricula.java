package SistemaAcademico.model;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private double nota1;
    private double nota2;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    public String verificarStatus() {
        double media = calcularMedia();
          if (media >= 7){
              return "Aprovado";

          } else if (media >= 5) {
              return "EXAME";

          } else {
              return "Reprovado";
          }
    }
    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() +
                " | Disciplina: " + disciplina.getNome() +
                " | Média: " + String.format("%.2f", calcularMedia()) +
                " | Status: " + verificarStatus();
    }
}

