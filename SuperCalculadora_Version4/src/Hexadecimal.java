public class Hexadecimal extends Número {
    public Hexadecimal(int numeroBase16) {
        super(numeroBase16);
    }
    public Hexadecimal(String numeroBase16){
        super(numeroBase16);
    }

    @Override
    public String transformarNumeroABase() {
        return Integer.toHexString(getValor());
    }

    @Override
    public int transformarBaseANumero() {
        return Integer.parseInt(getRepresentacion(),16);
    }

    @Override
    public String toString() {
        return getRepresentacion();
    }
}
