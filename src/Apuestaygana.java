

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


    public class Apuestaygana {
        public static void main(String[] args) {

            int num;
            int guardar;

            Random ale = new Random();
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce la cantidad inicial de dinero: ");
            double dinero = teclado.nextDouble();

            while (dinero > 0){
                 num = ale.nextInt((3))+1;
                 if(num==3){
                     System.out.println("!Pierde el juego");
                     dinero = 0;
                     break;

                 }else if(num==2){
                     System.out.println("¡Pierde la mitad del dinero");
                     dinero /= 2;
                     System.out.println("¿Quieres seguir jugando?");
                     guardar=teclado.nextInt();
                     if (guardar==1){
                         num = ale.nextInt((3))+1;
                         System.out.println("El numero nuevo aleatorio es:"+num);
                         continue;
                     }else {
                         break;
                     }

                 }else if(num==1){
                     System.out.println("Su dinero se multiplica por dos");
                     dinero *= 2;
                     System.out.println("¿Quieres seguir jugando?");
                     guardar=teclado.nextInt();
                     if (guardar==1){
                         num = ale.nextInt((3))+1;
                         System.out.println("El numero nuevo aleatorio es:"+num);
                         continue;
                     }else {
                         break;
                     }
                 }


            }






        }


    }

