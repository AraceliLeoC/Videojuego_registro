/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.lista;

import java.util.ArrayList;
import videojuego.elementos.videojuego;

/**
 *
 * @author arace
 */
public class ListaVideoJuegos {
    
   public ArrayList<videojuego> listavj;
    ArrayList<videojuego> video = new ArrayList<>();
    
    public ListaVideoJuegos(){
        this.listavj = new ArrayList<>();
    }
    
    public videojuego getVideoJuego(int index){
        return this.listavj.get(index);
    }//end getVideoJuego
    
    public void setVideoJuego(int index, videojuego juego){
        this.listavj.set(index, juego);
    }//end setVideoJuego
    
    //
    public int sizeListaVideoJuego(){
        return this.listavj.size();
    }//end sizeListaVideoJuego
    
    public void addVideoJuego(videojuego juego){
        this.listavj.add(juego);
    }//end addVideoJuego
    
    
}
