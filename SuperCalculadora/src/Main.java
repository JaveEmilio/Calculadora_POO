public class Main {
    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();
        Decimal total = (Decimal) Calculadora.sumar(new Decimal("10"), new Decimal(10));
        Binario total2 = (Binario) Calculadora.sumar(new Binario(2), new Binario("10"));
        Hexadecimal total3 = (Hexadecimal) Calculadora.sumar(new Hexadecimal(24), new Hexadecimal("18"));
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        //System.out.println(Calculadora.sumar(new Decimal(2), new Binario("10")));
        //System.out.println(calculadora.restar(6.2, 2.3));
        //System.out.println(calculadora.dividir(14.0, 3.0));
    }
}