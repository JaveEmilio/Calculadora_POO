public class Romano extends Número{
    public Romano(int numeroBaseDiez) {
        super(numeroBaseDiez);
    }

    public Romano(String numeroBaseDos) {
        super(numeroBaseDos);
    }

    @Override
    public String transformarNumeroABase() {
        String base = obtenerElValor(getValor());
        return base;
    }

    public String obtenerElValor(int valor) {
        int i, miles, centenas, decenas, unidades;
        String romano = "";
        //obtenemos cada cifra del número
        miles = valor / 1000;
        centenas = valor / 100 % 10;
        decenas = valor / 10 % 10;
        unidades = valor % 10;

        //millar
        for (i = 1; i <= miles; i++) {
            romano = romano + "M";
        }

        //centenas
        if (centenas == 9) {
            romano = romano + "CM";
        } else if (centenas >= 5) {
            romano = romano + "D";
            for (i = 6; i <= centenas; i++) {
                romano = romano + "C";
            }
        } else if (centenas == 4) {
            romano = romano + "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                romano = romano + "C";
            }
        }

        //decenas
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (i = 6; i <= decenas; i++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                romano = romano + "X";
            }
        }

        //unidades
        if (unidades == 9) {
            romano = romano + "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
            for (i = 6; i <= unidades; i++) {
                romano = romano + "I";
            }
        } else if (unidades == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano = romano + "I";
            }
        }
        return romano;
    }

    @Override
    public int transformarBaseANumero() {
        int numero = obtenerBase(getRepresentacion());
        return numero;
    }

    public int obtenerBase(String representacion) {
        int valor = 0;
        for (int i = representacion.length() - 1; i >= 0; i--) {
            char c = representacion.charAt(i);
            switch (c) {
                case 'I':
                    valor += (valor < 5) ? 1 : -1;
                    break;
                case 'V':
                    valor += 5;
                    break;
                case 'X':
                    valor += 10 * (valor < 50 ? 1 : -1);
                    break;
                case 'L':
                    valor += 50;
                    break;
                case 'C':
                    valor += 100 * (valor < 500 ? 1 : -1);
                    break;
                case 'D':
                    valor += 500;
                    break;
                case 'M':
                    valor += 1000;
                    break;
            }
        }
        return valor;
    }

    @Override
    public String toString() {
        return getRepresentacion();
    }
}
