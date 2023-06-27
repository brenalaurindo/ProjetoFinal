package br.edu.ifsc;

// Edson: Classe Decorator para atualização do laudo
abstract class LaudoDecorator implements LaudoObserver {
    protected LaudoObserver decoratedObserver;

    public LaudoDecorator(LaudoObserver decoratedObserver) {
        this.decoratedObserver = decoratedObserver;
    }

    public abstract void update(String laudo);
}
