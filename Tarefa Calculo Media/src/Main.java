import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double cont = 0;

        System.out.println("********************");
        System.out.println("CALCULADORA DE MÉDIA");
        System.out.println("********************");

        for(int i =0; i<4; i++){
            double variavelLocal =0;
            System.out.println("Digite " +(i+1)+"a nota: ");
            variavelLocal = sc.nextDouble();
            cont += variavelLocal;
        }

        System.out.println("A média de notas é: " + (cont/4));
        sc.close();
    }
}