import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFigura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Figura[] figuras = new Figura[20]; // se guardan aquí
        int contador = 0;
        int opcion = 0;

        do {
            System.out.println(" Calculadora Figuras Geometricas, crear:");
            System.out.println("1. Circulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Mostrar resumen de figuras creadas");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion (1-5): ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {

                    case 1 -> {
                        System.out.print("Radio: ");
                        double r = scanner.nextDouble();
                        figuras[contador++] = new Circulo(r);
                        System.out.println("Circulo creado");
                    }

                    case 2 -> {
                        System.out.print("Base: ");
                        double b = scanner.nextDouble();
                        System.out.print("Altura: ");
                        double h = scanner.nextDouble();
                        figuras[contador++] = new Rectangulo(b, h);
                        System.out.println("Rectángulo creado");
                    }

                    case 3 -> {
                        System.out.print("Base: ");
                        double base = scanner.nextDouble();

                        System.out.print("Altura: ");
                        double altura = scanner.nextDouble();
                        System.out.print("Lado restante: ");
                        double lado = scanner.nextDouble();
                        figuras[contador++] = new Triangulo(base, altura, lado);
                        System.out.println("Triángulo creado");
                    }

                    case 4 -> {
                        System.out.println(" Resumen de figuras:");
                        if (contador == 0) {
                            System.out.println("No hay figuras creadas.");

                        } else {
                            for (int i = 0; i < contador; i++) {
                                figuras[i].mostrarDatos();
                            }
                        }
                    }

                    case 5 -> System.out.println("Programa cerrado.");

                    default -> System.out.println("Opción invalida.");
                }

            } catch (InputMismatchException e) {  //pillar el error y que el programa no cierre
                System.out.println("Error: Debes ingresar un número correcto.");
                scanner.nextLine(); // limpiar el buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 5);

        scanner.close();
    }
}
