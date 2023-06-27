package br.edu.ifsc;

import java.util.Scanner;

// Classe Consulta
class Consulta {
    public static void realizarAtendimento(Paciente paciente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Consulta ===");
        System.out.print("Observações do médico: ");
        String observacoes = scanner.nextLine();
        System.out.print("Data de retorno (se houver): ");
        String dataRetorno = scanner.nextLine();
        paciente.update(paciente.getLaudo() + "\n Observações do médico: " + observacoes + " | Data de retorno: " + dataRetorno);
        System.out.println("Paciente " + paciente.getNome() + " atendido na Consulta.");
    }
}
