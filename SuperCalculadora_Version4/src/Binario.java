public class Binario extends Número{
    public Binario(int numeroBaseDos) {
        super(numeroBaseDos);
    }
    public Binario(String numeroBaseDos){
        super(numeroBaseDos);
    }

    @Override
    public String transformarNumeroABase() {
        return Integer.toBinaryString(getValor());
    }

    @Override
    public int transformarBaseANumero() {
        return Integer.parseInt(getRepresentacion(),2);
    }

    @Override
    public String toString() {
        return getRepresentacion();
    }
}
