import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("Conversor de tipos");
        System.out.println("******************");

        System.out.println("Digite um número double (digite o decimal com vírgula)");
        double valor = sc.nextDouble();

        Double valorWrapper =  valor;
        System.out.println("O valor convertido ficou: " + valorWrapper +"e ele é do tipo " +valorWrapper.getClass().getSimpleName());

        sc.close();
    }
}