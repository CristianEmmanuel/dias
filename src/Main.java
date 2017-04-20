import java.util.Scanner;

public class Main {

    private static String Resultado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingres el color que se encuentra el semaforo :");
        Resultado = scanner.next();
        String color1 = "rojo";
        String color2 = "amarillo";
        String color3 = "verde";
        //String semaforo = null;
        if (Resultado.equals(color1)) {
            System.out.println("El semaforo esta en rojo espera detras de la senda peatonal ...");
        } else if (Resultado.equals(color2)) {
                System.out.println("El semaforo esta en amarillo precaucion ...");
            } else if (Resultado.equals(color3)) {
                System.out.println("El semaforo esta en verde puedes avanzar !");
            }

        }
    }
