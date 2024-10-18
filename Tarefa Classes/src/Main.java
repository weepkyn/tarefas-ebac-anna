//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //instanciando um objeto do tipo calculadora
        Calculadora calculadora = new Calculadora();
        System.out.println("Calculadora de números inteiros");
        calculadora.divisao(2, 0); //aqui deve retornar que não é possível realizar a divisão
        calculadora.divisao(2, 1); //aqui a divisão deve ser possível
        calculadora.multiplicacao(1,1);
        calculadora.soma(4130, 7998);
        calculadora.subtracao(4130, 7998);
    }
}