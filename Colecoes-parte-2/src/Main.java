import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "S";
        Map<String, List<String>> nomes = new HashMap<>();
        nomes.put("feminino", new ArrayList<>());
        nomes.put("masculino", new ArrayList<>());

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Digite sua opção: \n" +
                    "1. Cadastrar Array com nomes\n" +
                    "2. Cadastrar tabela chave-valor\n" +
                    "3. Exibir dados da tabela chave-valor");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.println("Digite os nomes separados por vírgula: ");
                    String input = sc.nextLine();
                    List<String> namesList = new ArrayList<>(Arrays.asList(input.split(",")));
                    Collections.sort(namesList);

                    for (String name : namesList) {
                        System.out.println(name.trim());
                    }
                    break;

                case 2:
                    System.out.println("Digite o sexo da pessoa: (F/M)");
                    String sexo = sc.nextLine();

                    if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("feminino")) {
                        System.out.println("Digite o nome da pessoa: ");
                        String nome = sc.nextLine();
                        nomes.get("feminino").add(nome);
                    } else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("masculino")) {
                        System.out.println("Digite o nome da pessoa: ");
                        String nome = sc.nextLine();
                        nomes.get("masculino").add(nome);
                    } else {
                        System.out.println("Gênero inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Nomes cadastrados na tabela chave-valor:");
                    for (Map.Entry<String, List<String>> entry : nomes.entrySet()) {
                        System.out.println("Gênero: " + entry.getKey());
                        List<String> listaDeNomes = entry.getValue();
                        Collections.sort(listaDeNomes);

                        for (String nome : listaDeNomes) {
                            System.out.println(nome);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Deseja continuar? (S/N)");
            continuar = sc.nextLine();
        }

        sc.close();
    }
}
