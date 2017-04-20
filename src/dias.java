import java.util.Scanner;

/**
 * Created by cristian on 19/04/17.
 */
public class dias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor el dia de hoy :");

        String resultado = scanner.next();

        String dia1 = "lunes",dia2 = "martes",dia3 = "miercoles", dia4 = "jueves",dia5 = "viernes", dia6 = "sabado", dia7 = "domingo";

        String bebida1 = "agua", bebida2 = "gaseosa", bebida3 = "martinis";

        if (resultado.equals(dia1)){
            System.out.println("Es el primer dia de la semana toma " + bebida1 + " o sino " + bebida2 );
        }else if (resultado.equals(dia2)){
            System.out.println("Es el segundo dia de la semana toma " + bebida1 + " o sino " + bebida2);
        }else if (resultado.equals(dia3)) {
            System.out.println("Es el tercer dia de la semana toma " + bebida1 + " o sino " + bebida2);
        }else if (resultado.equals(dia4)) {
            System.out.println("Es el cuarto dia de la semana toma " + bebida1 + " o sino " + bebida2);
        }else if (resultado.equals(dia5)) {
            System.out.println("Llego el viernes podes tomar " + bebida2 + " o " + bebida3);
        }else if (resultado.equals(dia6)) {
            System.out.println("Es sabado a festejar con unos " + bebida3);
        }else if (resultado.equals(dia7)) {
            System.out.println("Es domingo toma " + bebida1 + " y recupera el higado jajaja !!!");
        }

        }

    }
