
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("Casio", 4 );
        //Operacion[] operaciones = {new Suma(45.0,56.2),
        //                           new Resta(45.1,45.2),
        //                           new Multiplicación(84,56),
        //                          new División(45.65,56.0)};
        calculadora.sumar(new Suma(1.0,2.0));
        calculadora.restar(new Resta(2.0,2.0));
        calculadora.multiplicar(new Multiplicación(5.3,2.6));
        calculadora.dividir(new División(5.3,5.0));
        System.out.println(calculadora.reporte());


    }
}