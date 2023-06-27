package br.edu.ifsc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Brena: Criando o objeto do hospital
        Hospital hospital = Hospital.getInstance();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Iniciar novo paciente");
            System.out.println("2. Abrir laudo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Edson: Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Mateus: Criando um novo paciente
                    System.out.println("=== Novo Paciente ===");
                    System.out.print("Nome do paciente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do paciente: ");
                    String cpf = scanner.nextLine();
                    Paciente paciente = new Paciente(nome, cpf);

                    // Mateus: Realizando o atendimento em cada etapa
                    Recepcao.realizarAtendimento(paciente);
                    Triagem.realizarAtendimento(paciente);
                    Consulta.realizarAtendimento(paciente);

                    // Mateus: Adicionando o paciente ao hospital
                    hospital.adicionarPaciente(paciente);
                    break;
                case 2:
                    // Mateus: Abrir laudo de um paciente pelo CPF
                    System.out.print("Digite o CPF do paciente: ");
                    String cpfPaciente = scanner.nextLine();
                    hospital.exibirLaudoPaciente(cpfPaciente);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        // Mateus: Exibindo todos os laudos
        System.out.println("=== Todos os Laudos ===");
        hospital.exibirTodosLaudos();
    }
}
