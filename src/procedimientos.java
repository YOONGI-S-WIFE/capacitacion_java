import java.util.ArrayList;

public class procedimientos {

    private ArrayList <String> hexadecimal = new ArrayList<>();
    private ArrayList <Double> octadecimal = new ArrayList<>();
    private Double residuo = 1d;
    private Double cociente = 10d;
    private StringBuilder numero_octal = new StringBuilder();
    private StringBuilder numero_hexa = new StringBuilder();

    public String hexadecimal (Double numero_recibido) {

        cociente = numero_recibido;

        while (cociente > 0) {

            residuo = Math.floor(cociente % 16);
            Integer residuo_int = residuo.intValue();

            if (residuo >=0 && residuo <= 9) {

            hexadecimal.add(residuo_int.toString());
            cociente = Math.floor(cociente / 16);
                
            } else {

                String residuo_transformado = "";

                switch (residuo_int) {

                    case 10:

                    residuo_transformado = "a";

                    hexadecimal.add(residuo_transformado);
                    cociente = Math.floor(cociente / 16);
                        
                    break;

                    case 11:

                    residuo_transformado = "b";

                    hexadecimal.add(residuo_transformado);
                    cociente = Math.floor(cociente / 16);    
                        
                    break;

                    case 12:

                    residuo_transformado = "c";

                    hexadecimal.add(residuo_transformado);
                    cociente = Math.floor(cociente / 16);
                        
                    break;

                    case 13:

                    residuo_transformado = "d";

                    hexadecimal.add(residuo_transformado);
                    cociente = Math.floor(cociente / 16);
                        
                    break;

                    case 14:

                    residuo_transformado = "e";

                    hexadecimal.add(residuo_transformado);
                    cociente = Math.floor(cociente / 16);
                        
                    break;

                    case 15:

                    residuo_transformado = "f";

                    hexadecimal.add(residuo_transformado);
                    cociente = Math.floor(cociente / 16);
                        
                    break;
                
                    default:
                        break;

                }
                
            }
       
        }

        Integer cociente_int = cociente.intValue();

        hexadecimal.add(cociente_int.toString());

        for (int i = hexadecimal.size() -1; i >= 0; i--) {

            if (!hexadecimal.isEmpty()) { 

                numero_hexa.append(hexadecimal.get(i).toString());
                
            }

        }
        
        return numero_hexa.toString();
        
    }

    public String octadecimal (Double numero_recibido) {

        cociente = numero_recibido;

        while (cociente != 0 && cociente >=8) {

            residuo = Math.floor(cociente % 8);

            if (residuo < 8 && residuo >= 0) {

            octadecimal.add(residuo);
            cociente = Math.floor(cociente / 8);
                
            } 
       
        }

        octadecimal.add(cociente);

        for (int i = octadecimal.size() -1; i>= 0; i--) {

            if (!octadecimal.isEmpty()) { 

                numero_octal.append(octadecimal.get(i).intValue());
                
            }

        }

        return numero_octal.toString();

    }
    
}
