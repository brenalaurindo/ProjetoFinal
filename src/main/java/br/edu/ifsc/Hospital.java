package br.edu.ifsc;

import java.util.HashMap;
import java.util.Map;

// Brena: Classe Singleton para o Hospital
class Hospital {
    private static Hospital instance;
    private Map<String, Paciente> pacientesMap;

    private Hospital() {
        pacientesMap = new HashMap<>();
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientesMap.put(paciente.getCpf(), paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacientesMap.remove(paciente.getCpf());
    }

    public void exibirLaudoPaciente(String cpf) {
        Paciente paciente = pacientesMap.get(cpf);
        if (paciente != null) {
            System.out.println("---- Laudo do Paciente ----");
            System.out.println(paciente.getLaudo());
            System.out.println("---------------------------");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void exibirTodosLaudos() {
        for (Paciente paciente : pacientesMap.values()) {
            System.out.println("CPF: " + paciente.getCpf());
            System.out.println("---- Laudo do Paciente ----");
            System.out.println(paciente.getLaudo());
            System.out.println("---------------------------");
        }
    }
}
