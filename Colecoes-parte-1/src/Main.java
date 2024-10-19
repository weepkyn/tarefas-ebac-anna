import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        System.out.println("Digite a quantidade de nomes que deseja inserir");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "aluno: ");
            String nome = sc.next();
            nomes.add(nome);

        }

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }

}