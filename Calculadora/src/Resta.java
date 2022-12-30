public class Resta extends Operación {

    public Resta(double minuendo, double sustraendo) {
        super("Resta", minuendo, sustraendo);
    }

    @Override
    public String toString() {
        return super.toString() + super.restar();
    }
}
