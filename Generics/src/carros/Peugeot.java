package carros;

import model.CarroAbstrato;

public class Peugeot <T,E> extends CarroAbstrato<T,E> {

    public Peugeot (T modelo, E ano){
        setModelo(modelo);
        setAno(ano);
    }
}
