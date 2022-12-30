public class Calculadora {
    private final String nombre;
    private final Operación[] operaciones;
    private final int numeroOperaciones;
    private int numeroAvance;

    public Calculadora(String nombre, int numeroOperaciones) {
        this.nombre = nombre;
        this.operaciones = new Operación[numeroOperaciones];
        this.numeroOperaciones = numeroOperaciones;
    }
    
    public void sumar(Suma suma) {
        operaciones[numeroAvance] = suma;
        operaciones[numeroAvance].sumar();
        numeroAvance++;
    }

    public void restar(Resta resta) {
        operaciones[numeroAvance] = resta;
        operaciones[numeroAvance].restar();
        numeroAvance++;
    }
    public void multiplicar(Multiplicación multiplicación) {
        operaciones[numeroAvance] = multiplicación;
        operaciones[numeroAvance].restar();
        numeroAvance++;
    }

    public void dividir(División división) {
        operaciones[numeroAvance] = división;
        operaciones[numeroAvance].restar();
        numeroAvance++;
    }
    public String reporte() {
        String reporte = "**Reporte**\n";
        for (Operación operación: operaciones) {
            reporte += operación.toString() +"\n";
        }
        return reporte;

    }


}
