/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import abstracta1.*;

public class Test {
    public static void main(String[] args) {
       FiguraGeometrica figura = new Rectangulo("Rectangulo1");
       
       //System.out.println(figura);
       figura.dibujar();
       
       figura = new Cuadrado("Cuadrado1");
       figura.dibujar();
       
    }
}


