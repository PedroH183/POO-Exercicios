package br.com.fila;

public class Fila {
    public Integer data;
    protected Fila prox;

    public Fila(int data, Fila prox) {
        this.data = data;
        this.prox = prox;
    }

    public void pushWithClassLinkedList(int data) {
        if (this.data == null) {
            this.data = data;
            return ;
        }
        Fila aux = this;

        while( aux.prox != null ){
            aux = aux.prox;
        }

        aux.prox = new Fila(data, null);
        return ;
    }

    public void listValues() {
        for(Fila aux = this; aux != null; aux = aux.prox) {
            System.out.println(aux.data);
        }

    }

    public int popWithClassLinkedList() {
        if (this.data == null) {
            return -1;
        }

        Integer removedElement = this.data;
        this.data = this.prox.data;
        this.prox = this.prox.prox;
        return removedElement;

    }
}
