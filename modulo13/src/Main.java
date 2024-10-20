public class Main {
    public static void main(String[] args) {

        Juridica j = new Juridica("1234567", "Pessoa", "Um");
        Fisica f = new Fisica("7654321", "Pessoa", "Dois");

        System.out.println("Pessoa Física: ");
        System.out.println(f.exibeDados());
        System.out.println(f.getCpf());

        System.out.println("Pessoa Jurídica: \n" +
                j.exibeDados());

    }
}