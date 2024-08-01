/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.lista;
import java.util.ArrayList;
import java.util.List;
import videojuego.elementos.Genero;
import videojuego.elementos.Main;
import videojuego.elementos.Plataforma;
/**
 *
 * @author arace
 */public class ListaPlataforma {
   private ArrayList<Plataforma> listap = new ArrayList<>();
   
   
   ////
       private List<Plataforma> plataformas;

    public ListaPlataforma(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }
    
    public ListaPlataforma(){
        this.listap = new ArrayList<>();
    }
    
    public Plataforma getPlataforma(int index){
        return this.listap.get(index);
    }
    
    public void setPlataforma(int index, Plataforma plat){
        this.listap.set(index, plat);
    }
    
    public int sizeListaPlataforma(){
        return this.listap.size();
    }
    
    public void addPlataforma(Plataforma plat){
        this.listap.add(plat);
    }
        public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Plataforma plataforma : plataformas) {
            sb.append(plataforma).append(", ");
        }
        return sb.toString();
    }
}
