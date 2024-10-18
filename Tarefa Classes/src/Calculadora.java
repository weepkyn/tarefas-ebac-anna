public class Calculadora {

    private int numero1, numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void soma(int num1, int num2) {
        int soma = num1 + num2;
        System.out.println("O resultado é " + soma);
    }

    public void subtracao(int num1, int num2) {
        int subtracao = num1 - num2;
        System.out.println("O resultado é " + subtracao);
    }

    public void multiplicacao(int num1, int num2){
        int multiplicacao = num1 * num2;
        System.out.println("O resultado é " + multiplicacao);
    }


    public void divisao(int num1, int num2) {
        if(num2 <= 0) {
            System.out.println("Não é possível realizar a divisão");
        }else{
            int divisao = num1 / num2;
            System.out.println("O resultado é " +divisao);
        }
    }
}
