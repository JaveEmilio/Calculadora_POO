public class Complejo extends Número{
    public Complejo(int numReal, int numImaginario){
        super(numReal,numImaginario);
    }
    public Complejo(String numReal, String numImaginario){
        super(numReal, numImaginario);
    }

    @Override
    public String transformarNumeroABase() {
        return getValorR() + " + " + getValorI() + " i";
    }

    @Override
    public int transformarBaseANumero() {
        return 0;
    }

    @Override
    public String toString() {
        return getRepresentacion();
    }
}
