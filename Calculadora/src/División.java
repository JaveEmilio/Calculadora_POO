public class División extends Operación {
    public División(double num1, double num2) {
        super("División", num1, num2);
    }

    @Override
    public String toString() {
        return super.toString() + super.dividir();
    }
}
