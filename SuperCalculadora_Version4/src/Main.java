public class Main {
    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();
        Decimal total = (Decimal) Calculadora.sumar(new Decimal("10"), new Decimal(10));
        Binario total2 = (Binario) Calculadora.sumar(new Binario(2), new Binario("10"));
        Hexadecimal total3 = (Hexadecimal) Calculadora.sumar(new Hexadecimal(24), new Hexadecimal("18"));
        Octal total4 = (Octal) Calculadora.sumar(new Octal(32), new Octal("40"));
        Romano total5 = (Romano) Calculadora.sumar(new Romano(2), new Romano("II"));
        Complejo total6 = (Complejo) Calculadora.sumar(new Complejo(5,3), new Complejo("2","5"));

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
        System.out.println(total6);
        //System.out.println(Calculadora.sumar(new Decimal(2), new Binario("10")));
        //System.out.println(calculadora.restar(6.2, 2.3));
        //System.out.println(calculadora.dividir(14.0, 3.0));
    }
}