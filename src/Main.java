import javax.swing.*;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        try{
    String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero: ");
    String segundoNumero  = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
    double primerNumero1 = Double.parseDouble(primerNumero);
    double segundoNumero1 = Double.parseDouble(segundoNumero);
    double resultado;
    String operador = JOptionPane.showInputDialog("Para Restar ingresa -  \n Para Sumar ingresa +  \n Para multiplicar ingresa *  \n Para dividir ingresa /");

       switch (operador) {
           case "+":
               resultado = primerNumero1 + segundoNumero1;
               break;
           case "-":
               resultado = primerNumero1 - segundoNumero1;
               break;
           case "*":
               resultado = primerNumero1 * segundoNumero1;
               break;
           case "/":
               if (segundoNumero1 == 0) {

                   segundoNumero = JOptionPane.showInputDialog("No se puede dividir por zero, vuelve a ingresar otro numero:");
                   segundoNumero1 = Double.parseDouble(segundoNumero);
               }
               resultado = primerNumero1 / segundoNumero1;
               break;
           default:
               System.out.println("No es un operador valido");
               main(args);
               return;



       }
        System.out.println("El resultado es : " + resultado);

        }catch (NumberFormatException e){
            System.out.println("Por favor Ingresa solo Numeros");
            main(args);
            System.exit(0);
        }

    }

}