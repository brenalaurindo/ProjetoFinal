package br.edu.ifsc;

import java.util.Scanner;

// Brena: Classe Recepção
class Recepcao {
    public static void realizarAtendimento(Paciente paciente) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Recepção ===");
        System.out.println("Paciente: " + paciente.getNome() + " | CPF: " + paciente.getCpf());
        paciente.update(" Nome: " + paciente.getNome() + " CPF: " + paciente.getCpf());
        System.out.println("Paciente atendido na Recepção.");
    }
}
