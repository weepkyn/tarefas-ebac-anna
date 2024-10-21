package carros;

import model.CarroAbstrato;

public class Honda<T, E> extends CarroAbstrato<T, E> {


    public Honda(T modelo, E ano) {
        setModelo(modelo);
        setAno(ano);
    }

}


