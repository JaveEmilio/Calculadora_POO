public class Multiplicación extends Operación {

    public Multiplicación( double factor1, double factor2) {
        super("multipilcación", factor1, factor2);
    }

    @Override
    public String toString() {
        return super.toString() + super.multiplicar();
    }
}
