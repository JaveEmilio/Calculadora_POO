public abstract class Número {
    private int valor;
    private  String representación;
    private int parteReal;
    private int parteImaginaria;


    public Número(int numeroBaseDiez) {
        this.valor= numeroBaseDiez;
        this.representación = transformarNumeroABase();
    }

    public Número(String numeroBaseDos){
        this.representación = numeroBaseDos;
        this.valor = transformarBaseANumero();
    }
    public Número(int parteReal, int parteImaginaria){

        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        this.representación = transformarNumeroABase();
    }

    public Número(String parteRealR, String parteImaginariaR){
        this.parteReal = Integer.parseInt(parteRealR);
        this.parteImaginaria = Integer.parseInt(parteImaginariaR);
        this.representación = transformarNumeroABase();
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


    public int getValorR() {return parteReal;
    }

    public int getValorI() {return parteImaginaria;
    }
}
