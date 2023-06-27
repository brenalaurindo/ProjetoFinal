package br.edu.ifsc;

import java.util.Scanner;

// Classe Triagem
class Triagem {
    public static void realizarAtendimento(Paciente paciente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Triagem ===");
        System.out.print("Pressão do paciente: ");
        String pressao = scanner.nextLine();
        System.out.print("Temperatura do paciente: ");
        String temperatura = scanner.nextLine();
        System.out.print("Possíveis alergias do paciente: ");
        String alergias = scanner.nextLine();
        System.out.print("Sintomas do paciente: ");
        String sintomas = scanner.nextLine();
        paciente.update(paciente.getLaudo() + "\n Pressão: " + pressao + " | Temperatura: " + temperatura
                + " | Alergias: " + alergias + " | Sintomas: " + sintomas);
        System.out.println("Paciente " + paciente.getNome() + " atendido na Triagem.");
    }
}
