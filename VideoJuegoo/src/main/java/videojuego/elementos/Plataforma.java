/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.elementos;

/**
 *
 * @author arace
 */
public class Plataforma {
    private String nombre;
    String descripcion;
    String formato;
    
 public Plataforma(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.formato=formato;
    }
    public Plataforma(String nombre, String descripcion, String formato) {
       
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Plataforma{" + ", tipoPlataforma=" + nombre + ", descripcion=" + descripcion + '}'+"Formato="+formato;
    }
    
    public String toStringCSV() {
        return nombre + "," + descripcion+","+formato;
    }

  
}
