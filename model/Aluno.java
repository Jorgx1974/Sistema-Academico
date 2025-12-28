package SistemaAcademico.model;

public class Aluno {
    private int id;
    private String nome;
    private String matricula;

    public Aluno(int id, String nome, String matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public String getMatricula() {
        return matricula;
    }


    @Override
      public String toString() {
        return
                "aluno{" +
                        "id =" + id +
                        ", nome = ' " + nome + '\'' +
                        ", matricula= '" + matricula + '\'' +
  '}';  }

    }

