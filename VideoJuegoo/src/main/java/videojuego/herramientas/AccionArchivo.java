/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego.herramientas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author arace
 */
public class AccionArchivo {
    //Atributo para almacenar la ruta del archivo
    private String rutaArchivo;
    
    public AccionArchivo(){
        //Se especifica el atributo rutaArchivo para que localice la ruta de donde va a encontrar el archivo a procesar
        this.rutaArchivo = "";
    }//end constructor vacio
    
    public AccionArchivo(String rutaArchivo){
        //Se especifica el atributo rutaArchivo para que localice la ruta de donde va a encontrar el archivo a procesar
        this.rutaArchivo = rutaArchivo;
    }//end constructor vacio
    
    //Setter & Getters
    public String getRutaArchivo() {
        return rutaArchivo;
    }
    public void llenarArchivo(String datos) throws IOException{
        //Aplicar el proceso de lectura de la información del archivo
        BufferedWriter buffer = new BufferedWriter(new FileWriter(this.getRutaArchivo(), true));
        //Realiza el proceso de escritura
        buffer.write(datos);
         buffer.newLine();
        //Cierra el archivo a modificar
        buffer.close();
    }//end llenarArchivo 
    
    
    public ArrayList<String> leerArchivo() throws FileNotFoundException, IOException{
        //Se crea una clase abstracta para almacenar temporalmente el resultado obtendido
        ArrayList<String> lineasArchivo = new ArrayList<>();
        //Se declara una variable, esta va a almacenar toda la información enconrada
        String lineasLectura = "";
        //Se crea una petición de escritura y lectura
        BufferedReader lectorArchivo = new BufferedReader(new FileReader(this.getRutaArchivo()));
        //Se verifica si la filda tiene información
        while((lineasLectura = lectorArchivo.readLine()) != null){
            lineasArchivo.add(lineasLectura);
        }
        //Se libera la apertura del archivo
        lectorArchivo.close();
        return lineasArchivo;
    }
    
    public static void vaciarJuegos() throws IOException {
        String nombre = "C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(nombre, false));
        buffer.write("");
        buffer.close();
    }
    public static void vaciarGeneros() throws IOException {
        String nombre = "C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(nombre, false));
        buffer.write("");
        buffer.close();
    }
    public static void vaciarPlataformas() throws IOException {
        String nombre = "C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(nombre, false)); 
        buffer.write("");
        buffer.close();
    }
    public static void insertarJuegos(String datos) throws IOException {
        String nombre ="C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(nombre, true));
        buffer.write(datos);
        buffer.newLine();
        buffer.close();
    }
    public static void insertarGeneros(String datos) throws IOException {
        String nombre = "C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(nombre, true));
        buffer.write(datos);
        buffer.newLine();
        buffer.close();
    }
    public static void insertarPlataformas(String datos) throws IOException {
        String nombre ="C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(nombre, true));
        buffer.write(datos);
        buffer.newLine();
        buffer.close();
    }

    public static ArrayList<String[]> leerJuegos() throws IOException {
        String nombre ="C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));
        ArrayList<String[]> juegos = new ArrayList<>();
        String linea;

        while ((linea = buffer.readLine()) != null) {
            String[] campos = linea.split(",");
            juegos.add(campos);
        }

        buffer.close();
        return juegos;
    }
    public static ArrayList<String[]> leerGeneros() throws IOException {
        String nombre = "C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));
        ArrayList<String[]> generos = new ArrayList<>();
        String linea;

        while ((linea = buffer.readLine()) != null) {
            String[] campos = linea.split(",");
            generos.add(campos);
        }

        buffer.close();
        return generos;
    }
    public static ArrayList<String[]> leerPlataformas() throws IOException {
        String nombre = "C:\\Users\\arace\\OneDrive\\Escritorio\\prueba.csv";
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));
        ArrayList<String[]> plataformas = new ArrayList<>();
        String linea;

        while ((linea = buffer.readLine()) != null) {
            String[] campos = linea.split(",");
            plataformas.add(campos);
        }
        buffer.close();
        return plataformas;
    }
}


