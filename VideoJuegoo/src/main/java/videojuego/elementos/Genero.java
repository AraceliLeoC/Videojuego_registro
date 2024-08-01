/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.elementos;

/**
 *
 * @author arace
 */
public class Genero {
    private int id;
    private String nombre;
    private String descripcion;
    
    public Genero(int id,char gen, String desg){
        
    }
    public Genero(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
    }
     public Genero(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
       /* final StringBuilder sb=new StringBuilder ();
        sb.append(this.nombre);
        return sb.toString();*/
        return "" + nombre + "" + descripcion ;
    }
    
    public String toStringCSV() {
        return nombre + "," + descripcion;
    }

    public boolean sizeListaGenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
