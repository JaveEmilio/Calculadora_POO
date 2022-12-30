public abstract class Operación {

    private final String nombreOperación;
    private double num1 = 0.0;
    private double num2 = 0.0;

    public Operación(String nombreOperación, double num1, double num2) {
        this.nombreOperación = nombreOperación;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar(){
        return num1 + num2;
    };

    public double restar(){
        return num1 - num2;
    };
    public double multiplicar(){return num1 * num2;}
    public double dividir(){
        //verificar si el divisor es mayor que cero
        if(!verificarDivisoresCero(num2)){
            System.out.println("no se puede dividir un numero para cero");
            return -1;
        }
        return num1 / num2;
    }

    private boolean verificarDivisoresCero(double num2) {
        return num2 != 0;
    }

    @Override
    public String toString() {
        return "\t" + nombreOperación + ": " ;   }
}
