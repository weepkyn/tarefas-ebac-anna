public abstract class Pessoa {

    String nome;
    String sobrenome;

    public void realizarCompra(){
        System.out.println("Compra realizada.");
    }

    public abstract String exibeDados();
}
