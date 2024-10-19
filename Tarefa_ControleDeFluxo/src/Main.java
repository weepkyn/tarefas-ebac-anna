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

    for(int i=0; i<=3; i++){
        System.out.println("Digite a " +(i+1) +"a nota: ");
        cont+=sc.nextDouble();
        }

    double media = cont/4;

    if(media >=7){
        System.out.println("Aprovado");
    }else if(media >=5){
        System.out.println("Em recuperação");
    }else{
        System.out.println("Reprovado");
    }
    }
}