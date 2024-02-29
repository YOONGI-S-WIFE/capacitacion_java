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

            while (seguir == 1) {

                System.out.println("por favor digita un numero DECIMAL");

            try {

            numero_recibido = leer.nextDouble();
            seguir = 0;
            
                } catch (Exception e) {

                    System.out.println("digitaste un caracter invalido, intentalo otra vez");
                    seguir = 1;

                }
                
            }
        
        System.out.println("el numero que digitaste en el sistema hexadecimal es: " + resultado.hexadecimal(numero_recibido));
        System.out.println("el numero que digitaste en el sistema octadecimal es: " + resultado.octadecimal(numero_recibido));

        System.out.println("desea proporcionar otro numero?");
        System.out.println("si ese es el caso dijite 1 para seguir y 0 para terminar el programa");
        seguir = leer.nextInt();

        }

    }
    
}
