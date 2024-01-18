import java.util.InputMismatchException;
import java.util.Scanner;

class Radio {
    private boolean estaEncendido;
    private String banda; // AM o FM
    private double frecuencia;
    private String[] emisorasGuardadas;
    private Scanner scanner; // Declare a Scanner field

    public Radio(Scanner scanner) {
        estaEncendido = false;
        banda = "AM";
        frecuencia = 530.0;
        emisorasGuardadas = new String[12];
        this.scanner = scanner; // Initialize the Scanner field
    }

    
    }
}
