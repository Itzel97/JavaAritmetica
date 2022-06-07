package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    //la sobre carga de constructores es agregar uno o mas contructores
    public Aritmetica() {
        System.out.println("Ejecutando constructor ");

    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }

    //Metodo
    public void sumar() {

        int resultado = a + b;
        System.out.println("resultado = " + resultado);

    }

    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }

    public int sumerConArgumentos(int a, int b) {

        this.a = a;
        this.b = b;

        return this.sumarConRetorno();

    }

}
