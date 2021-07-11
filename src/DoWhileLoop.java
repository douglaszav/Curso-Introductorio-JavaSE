import java.util.Scanner;

public class DoWhileLoop {
    /**Clase sobre Do-While*/
    public static void main(String[] args) {
        boolean var1 = false;

        int response;
        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response) {
                case 0:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while(response != 0);

        System.out.println("Se terminó el programa");
    }
}
