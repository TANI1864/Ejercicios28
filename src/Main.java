//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int peso = 0;
        double IMC;



        Random ale = new Random();


        double estatura;




            Scanner teclado = new Scanner (System.in);
            System.out.println("Ingrese su Peso");
            peso  = teclado.nextInt();
            System.out.println("Ingrese su Estatura");
            estatura= teclado.nextDouble();
            IMC =(peso /(Math.pow(estatura,2)));


            if (IMC < 18.5) {
                System.out < 24.9){
                System.out.println("¡Su peso es normal");
            }else if (IMC < 25-26.9){
                System.out.println("¡Sobrepeso en grado II!");
            }else if (IMC < 27-29.9){
                System.out.println();
        }else if (IMC < 30-34.9) {
                System.out.println("¡obesida de tipo I");
            }else if (IMC < 35-39.9){
                System.out.println("¡obesidad de tipo II");
            }else if (IMC <40-49.9){
                System.out.println("¡obesida de tipo II");
        }else if (IMC < 50){
                System.out.println("¡obesidad de tipo iv");
            }




    }


}