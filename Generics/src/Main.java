import carros.Honda;
import carros.Peugeot;
import model.CarroAbstrato;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static <T> void main(String[] args) {


        List< CarroAbstrato> carros = new ArrayList< CarroAbstrato>();

        Honda honda = new Honda("HR-V", 2025);
        carros.add(honda);
        Peugeot peugeot = new Peugeot("PEUGEOT 208", 2025);
        carros.add(peugeot);

        for(CarroAbstrato carro: carros){
            System.out.println(carro.getModelo() + "-" +carro.getAno());
        }
    }
}