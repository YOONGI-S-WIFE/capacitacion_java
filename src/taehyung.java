import java.util.InputMismatchException;
import java.util.Scanner;

public class taehyung {

        private Scanner leer = new Scanner(System.in);
        private procedimientos resultado = new procedimientos();
        private Integer seguir = 1;
        private double numero_recibido = 0;

        public void ejecucion () {

        System.out.println("hola querido usuario 😊");
        System.out.println("el dia de hoy me proporcionaras un numero DECIMAL y te lo mostrare en media octal y hexadecimal");

        while (seguir == 1) {

            int continuar = 1;

            while (continuar == 1) {

            try {

            System.out.println("por favor digita un numero DECIMAL");
            numero_recibido = leer.nextDouble();
            continuar = 0;
            
            } catch (InputMismatchException e) {

                    System.out.println("digitaste un caracter invalido, intentalo otra vez");
                    leer.next();

                }

            }
        
        System.out.println("el numero que digitaste en el sistema hexadecimal es: " + resultado.hexadecimal(numero_recibido));
        resultado.limpiar_hexadecimal();
        resultado.setNumero_hexa(new StringBuilder(""));
        System.out.println("el numero que digitaste en el sistema octadecimal es: " + resultado.octadecimal(numero_recibido));
        resultado.limpiar_octadecimal();
        resultado.setNumero_octal(new StringBuilder(""));

        System.out.println("desea proporcionar otro numero?");
        System.out.println("si ese es el caso dijite 1 para seguir y 0 para terminar el programa");
        seguir = leer.nextInt();

        }

    }
    
}
