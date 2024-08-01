/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.lista;
import java.util.ArrayList;
import videojuego.elementos.Genero;
import videojuego.elementos.Main;
import java.util.List;
/**
 *
 * @author arace
 */
public class ListaGenero{

   
    //public ArrayList<Genero> listag;
    private List<ListaGenero> listeners = new ArrayList<>();
    private ArrayList<Genero> listag = new ArrayList<>();
    
    private List<Genero> generos;

    public ListaGenero(List<Genero> generos) {
        this.generos = generos;
    }

    public List<Genero> getGeneros() {
        return generos;
    }
    
    
    public ListaGenero(){
        this.listag = new ArrayList<>();
    }
    
    public Genero getGenero(int index){
        return this.listag.get(index);
    }
    
    public void setGenero(int index, Genero genero){
        this.listag.set(index, genero);
    }
    
    public int sizeListaGenero(){
        return this.listag.size();
    }
    
    public void addGenero(Genero genero){
        this.listag.add(genero);
    }
    
      public Boolean isEmptyListaGenero(){
        return this.listag.isEmpty();
    }//end isEmpty
  public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Genero genero : generos) {
            sb.append(genero).append(", ");
        }
        return sb.toString();
    }
 
    
}