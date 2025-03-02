import java.util.Random;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean continuar = true;

        while (continuar) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            System.out.println("Números generados: " + num1 + " y " + num2);
            System.out.print("Introduce un operador aritmético (+, -, *, /, ^, %): ");
            String operador = scanner.next();

            double resultado = 0;
            boolean operacionValida = true;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                    } else {
                        System.out.println("Error: División por cero.");
                        operacionValida = false;
                    }
                    break;
                case "^":
                    resultado = Math.pow(num1, num2);
                    break;
                case "%":
                    resultado = num1 % num2;
                    break;
                default:
                    System.out.println("Operador no válido.");
                    operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.print("¿Quieres realizar otra operación? (1: Sí, 0: No): ");
            int respuesta = scanner.nextInt();

            if (respuesta != 1) {
                continuar = false;
            }
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }
}



