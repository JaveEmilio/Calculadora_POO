public class Suma extends Operación{
    private final double sumando1;
    private final double sumando2;

    public Suma(double sumando1, double sumando2) {
        super("suma",sumando1, sumando2);
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;

    }

    @Override
    public String toString() {
        return super.toString() + super.sumar();
    }
}
