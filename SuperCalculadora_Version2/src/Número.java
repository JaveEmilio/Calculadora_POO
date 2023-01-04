public abstract class Número {
    private final int valor;
    private final String representación;


    public Número(int numeroBaseDiez) {
        this.valor= numeroBaseDiez;
        this.representación = transformarNumeroABase();
    }

    public Número(String numeroBaseDos){
        this.representación = numeroBaseDos;
        this.valor = transformarBaseANumero();
    }

    @Override
    public String toString() {
        return representación;
    }

    public abstract String transformarNumeroABase();


    public abstract int transformarBaseANumero();

    public int getValor(){
        return valor ;
    }
    public String getRepresentacion(){
        return  representación;
    }


}
