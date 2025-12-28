package SistemaAcademico.src;


import SistemaAcademico.service.SistemaService;
import SistemaAcademico.until.MenuUtil;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        SistemaService sistema = new SistemaService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            MenuUtil.mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> sistema.cadastrarAluno();
                case 2 -> sistema.cadastrarDisciplina();
                case 3 -> sistema.matricularAluno();
                case 4 -> sistema.lancarNotas();
                case 5 -> sistema.listarMatriculas();
                case 0 -> System.out.println("👋 Sistema encerrado.");
                default -> System.out.println("❌ Opção inválida.");
            }

        } while (opcao != 0);
    }
}