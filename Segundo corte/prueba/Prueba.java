/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import abstr.*;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args)
    {
        String colorDelCuadrado;
        double ladoDelCuadrado;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el color del cuadrado: ");
        colorDelCuadrado = teclado.nextLine();

        System.out.print("Introduzca el lado del cuadrado: ");
        ladoDelCuadrado = teclado.nextDouble();

  
		Cuadrado cuadrado1 = new Cuadrado(colorDelCuadrado, ladoDelCuadrado);

        System.out.printf("El área del cuadrado %s es: %f\n", cuadrado1.getColor(), cuadrado1.calcularArea());
    }
}
