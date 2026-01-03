package SistemaAcademico.util;

public class Validador {

    public static void textoObrigatorio(String texto, String campo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "❌ O campo '" + campo + "' não pode estar vazio."
            );
        }
    }

    public static void numeroPositivo(int numero, String campo) {
        if (numero <= 0) {
            throw new IllegalArgumentException(
                    "❌ O campo '" + campo + "' deve ser maior que zero."
            );
        }
    }

    public static void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException(
                    "❌ Nota inválida. Deve estar entre 0 e 10."
            );
        }
    }
}