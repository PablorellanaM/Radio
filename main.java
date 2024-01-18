import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Radio radio = new Radio(scanner);

        int opcion;
        do {
            mostrarMenu();
            System.out.print("Ingrese su opción preferida: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    radio.encender();
                    break;
                
            }
        } while (opcion != 6);

        scanner.close();
    }

   
}
