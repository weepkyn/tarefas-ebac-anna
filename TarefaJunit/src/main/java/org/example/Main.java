import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static List<String> filtrarMulheres(HashMap<String, String> map) {
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equalsIgnoreCase("F"))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        System.out.println("Digite a quantidade de pessoas que irá inserir:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome e o gênero (F/M) da pessoa separado por vírgula:");

        for (int i = 0; i < n; i++) {
            String entrada = sc.nextLine();
            String[] partes = entrada.split(",");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();
                map.put(nome, genero);
            } else {
                System.out.println("Entrada inválida. Certifique-se de usar nome e gênero separados por vírgula.");
            }
        }

        List<String> mulheres = filtrarMulheres(map);
        System.out.println("Lista de mulheres: " + mulheres);
    }
}
