/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.elementos;
import java.io.IOException;
import java.util.ArrayList;
import videojuego.herramientas.AccionArchivo;
import videojuego.vista.ViewMain;

import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author arace
 */
public class Main {
      public static  ArrayList<videojuego> videojuegos = new ArrayList<>();
      public static  ArrayList<Genero> listag= new ArrayList<>();
      public static  ArrayList<Plataforma> listap= new ArrayList<>();
    public static void main(String[] args) {
        videojuegos = new ArrayList<>();
        ViewMain m=new ViewMain();
        m.setVisible(true);
        
    }
}