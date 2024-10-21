package model;

public class CarroAbstrato <T, E> implements ICarro{

    private T modelo;
    private E ano;


    @Override
    public void andar() {
        System.out.println("Andando...");
    }

    @Override
    public void parar() {
        System.out.println("Parando...");
    }

    public E getAno() {
        return ano;
    }

    public void setAno(E ano) {
        this.ano = ano;
    }

    public T getModelo() {
        return modelo;
    }

    public void setModelo(T modelo) {
        this.modelo = modelo;
    }
}
