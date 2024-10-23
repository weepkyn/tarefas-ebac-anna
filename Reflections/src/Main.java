//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@Tabela(valor = "Tarefa Reflections")
public class Main  {
    public static void main(String[] args) {

        @Tabela(valor = "tabela")
        String nome = "Ebac";

        Class <?> classe = Main.class;

        Tabela[] anotacoes = classe.getAnnotationsByType(Tabela.class);

        if(anotacoes.length != 0){
            for (Tabela anotacao : anotacoes) {
                System.out.println(anotacao);
            }
        }else{
            System.out.println("Não há anotação na classe main.");
        }

    }
}