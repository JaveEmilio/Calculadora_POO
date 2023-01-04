public class Decimal extends Número {
    public Decimal(int numeroBaseDiez) {
        super(numeroBaseDiez);
    }

    public Decimal(String numeroBaseDiez) {
        super(numeroBaseDiez);
    }
    @Override
    public String transformarNumeroABase() {
        return Integer.toString(getValor());
    }

    @Override
    public int transformarBaseANumero() {
        return Integer.parseInt(getRepresentacion());
    }

}
