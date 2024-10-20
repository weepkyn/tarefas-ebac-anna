public class Fisica extends Pessoa {

    String cpf;

    public Fisica(String cpf, String nome, String sobrenome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String exibeDados() {
        return "CPF: " + cpf + "- Nome:" + this.nome;
    }

    public String getCpf() {
        return cpf;
    }
}
