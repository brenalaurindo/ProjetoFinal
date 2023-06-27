package br.edu.ifsc;

// Classe Paciente que implementa o Observer
class Paciente implements LaudoObserver {
    private String nome;
    private String cpf;
    private String laudo;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.laudo = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getLaudo() {
        return laudo;
    }

    @Override
    public void update(String laudo) {
        setLaudo(laudo);
    }
}
