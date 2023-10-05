/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Estudiantes
 */
public class persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    //contructor por vacio
    public persona(){
        
    }
    
    //Constructor con un dato
    public persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    //metodos de Getters y Setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(this.nombre);
        sb.append(", genero=").append(this.genero);
        sb.append(", edad=").append(this.edad);
        sb.append(", direccion=").append(this.direccion);
        sb.append('}');
        return sb.toString();
    }
}
