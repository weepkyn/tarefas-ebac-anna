//Para criar uma anotação, deve-se utilizar "@" na frente de interface, para indicar que é uma anotação. O nome da interface será o nome da anotação
public @interface Tabela  {

    //Os atributos são passados como se fossem métodos vazios.
    //O valor retornado por esse método será o valor da anotação quando for usada.
    String valor ();
}
