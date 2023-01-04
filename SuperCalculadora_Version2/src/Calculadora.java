public class Calculadora {

    public static Decimal sumar(Decimal n1, Decimal n2) {
        return new Decimal(n1.getValor() + n2.getValor());
    }
    public static Binario sumar(Binario n1, Binario n2){
        return new Binario(n1.getValor() + n2.getValor());
    }
    public static Hexadecimal sumar(Hexadecimal n1, Hexadecimal n2){
        return new Hexadecimal(n1.getValor() + n2.getValor());
    }
    public static Octal sumar (Octal n1, Octal n2){
        return new Octal(n1.getValor() + n2.getValor());
    }

}
