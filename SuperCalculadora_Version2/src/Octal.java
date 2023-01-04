public class Octal extends Número{
    public Octal(int numeroBaseOcho) {
        super(numeroBaseOcho);
    }
    public Octal(String numeroBaseOcho){
        super(numeroBaseOcho);
    }

    @Override
    public String transformarNumeroABase() {
        return Integer.toOctalString(getValor());
    }

    @Override
    public int transformarBaseANumero() {
        return Integer.parseInt(getRepresentacion(),8);
    }
}
