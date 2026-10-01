
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // https://github.com/JesusGonzalez7777/Ejercicio_05---Funcional---Operaciones-b-sicas---Paradigma-Declarativo.git
        
        int opcion = 0;

        while (opcion != 5) {
            opcion = menu();

            switch (opcion) {
                case 1:
                    // Programación Funcional (Suma)

                    muestraResultados("El resultado de la suma es", suma(numeroTeclado(), numeroTeclado()));
                    break;

                case 2:
                    // Programación Estructurada (Resta)

                    float n1Resta = numeroTeclado();
                    float n2Resta = numeroTeclado();
                    float rResta = resta(n1Resta, n2Resta);
                    muestraResultados("El resultado de la resta es", rResta);
                    break;

                case 3:
                    // Programación Funcional (División)

                    float n1Div = numeroTeclado();
                    float n2Div = numeroTeclado();

                    if (n2Div == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        muestraResultados("El resultado de la división es", division(n1Div, n2Div));
                    }
                    break;

                case 4:
                    // Programación Estructurada (Multiplicación)

                    float n1Mult = numeroTeclado();
                    float n2Mult = numeroTeclado();
                    float rMult = multiplicacion(n1Mult, n2Mult);
                    muestraResultados("El resultado de la multiplicación es", rMult);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            System.out.println();
        }
    }


    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Division");
        System.out.println("4.- Multiplicación");
        System.out.println("5.- Salir");
        System.out.print("Elige un numero: ");
        return sc.nextInt();
    }

    // Suma y División
    public static float suma(float a, float b) {
        return a + b;
    }

    public static float division(float a, float b) {
        return a / b;
    }

    // Resta y Multiplicación
    public static float resta(float n1, float n2) {
        return n1 - n2;
    }

    public static float multiplicacion(float n1, float n2) {
        return n1 * n2;
    }


    public static float numeroTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        return sc.nextFloat();
    }

    public static void muestraResultados(String mensaje, float resultado) {
        System.out.println(mensaje + " : " + resultado);
    }
}