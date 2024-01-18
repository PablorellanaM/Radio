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
                    case 2:
                    radio.cambiarBanda();
                    break;
                case 3:
                    radio.sintonizarEmisora();
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Operaciones Radiofónicas:");
        System.out.println("1. Encender Radio");
        System.out.println("2. Cambiar de Banda");
        
    }
}
