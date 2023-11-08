/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstr;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		return lado*lado;
	}	
}