/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.elementos;

import java.util.ArrayList;
import videojuego.lista.ListaGenero;
import videojuego.lista.ListaPlataforma;

/**
 *
 * @author arace
 */
public class videojuego {
   private String nombre;
    private double precio;
    String desarrolladora;
    String lanzamiento;
    String clasificacion;
    int formato;
    boolean multiplayer;
    boolean tieneDescuento;
    double cantidadDescuento;
    String limite;
   private Plataforma plataforma;
    private Genero genero;
    private ListaGenero listag;
    private ListaPlataforma listap;

    public videojuego(String nombre, double precio, String desarrolladora, String lanzamiento, String clasificacion, String limite, boolean multiplayer) {
        this.nombre = nombre;
        this.precio = precio;
        this.desarrolladora = desarrolladora;
        this.lanzamiento = lanzamiento;
        this.clasificacion = clasificacion;
        this.formato = formato;
        this.multiplayer = multiplayer;
        this.tieneDescuento = tieneDescuento;
        this.cantidadDescuento = cantidadDescuento;
        this.limite = limite;
        
      // Inicialización de listap y listag como listas vacías
        this.listap = new ListaPlataforma(new ArrayList<>());
        this.listag = new ListaGenero(new ArrayList<>());
    }
      // Método para agregar una plataforma
    public void agregarPlataforma(Plataforma plataforma) {
        listap.getPlataformas().add(plataforma);
    }

    // Método para agregar un género
    public void agregarGenero(Genero genero) {
        listag.getGeneros().add(genero);
    }
    public videojuego(){
        
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getFechaLanzamiento() {
        return lanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.lanzamiento = fechaLanzamiento;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }

    public boolean isModoMultijugador() {
        return multiplayer;
    }

    public void setModoMultijugador(boolean modoMultijugador) {
        this.multiplayer = modoMultijugador;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean isDescuento) {
        this.tieneDescuento = isDescuento;
    }

    public double getDescuento() {
        return cantidadDescuento;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public double getCantidadDescuento() {
        return cantidadDescuento;
    }

    public void setCantidadDescuento(double cantidadDescuento) {
        this.cantidadDescuento = cantidadDescuento;
    }

    public void setDescuento(double descuento) {
        this.cantidadDescuento = descuento;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String toStringCSV() {
         return nombre + "," + precio + "," + desarrolladora + "," + lanzamiento + "," + clasificacion + "," + formato + "," + multiplayer + "," + cantidadDescuento + "," + limite + "," + listap + "," + listag;
    }
    
    //Metodo para calcular el porcentaje de descuento
    public double calDesc(double porcentaje){
        return this.precio * porcentaje;    
    }
    
    @Override
    public String toString() {
        return "VideoJuego{" + "nombre=" + nombre + ", precio=" + precio + ", desarrolladora=" + desarrolladora + ", fechaLanzamiento=" + lanzamiento + ", clasificacion=" + clasificacion + ", formato=" + formato + ", modoMultijugador=" + multiplayer + ", isDescuento=" + tieneDescuento + ", descuento=" + cantidadDescuento + ", plataforma=" + plataforma + ", genero=" + genero + ", limite=" + limite + '}';
    }
    
    public static void main(String[] args) {
        
    }
    
}
