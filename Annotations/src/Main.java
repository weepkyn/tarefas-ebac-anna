//utilizando a anotação passando um valor em uma classe.
//as anotações podem ser usadas em métodos, construtores, classes e atributos da classe.
@Tabela(valor = "Olá, mundo!")
public class Main {
    public static void main(String[] args) {

        //Usando a anotação em um atributo.
        @Tabela(valor = "tabela")
        String nome = "Ebac";

        System.out.println("Olá, mundo.");
        System.out.println("Este é um programa onde eu uso uma anotação personalizada na classe main! ");

    }
}



