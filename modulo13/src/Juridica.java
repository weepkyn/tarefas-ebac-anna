public class Juridica extends Pessoa{

    String cnpj;

    public Juridica(String cnpj, String nome, String sobrenome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String exibeDados() {
        return "CNPJ: " + cnpj +"- Nome: "+ this.nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
