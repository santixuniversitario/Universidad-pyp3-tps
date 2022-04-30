/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package videoclubclass.videoclub;

/**
 *
 * @author Santiago Z
 */
public class VideoClub {

    public static void main(String[] args) {
        
        // Instanciar Objetos con Setters and Getters
        
        Pelicula spiderman = new Pelicula();
        categoria categoria = new categoria();
        categoria.setNombre("accion");
        categoria otraCategoria = new categoria();
        otraCategoria.setNombre("Ciencia Ficcion");
        spiderman.setTitulo("lejos de casa");
        spiderman.setAnioEstreno(1994);
        spiderman.setCategoria(categoria);
        System.out.println(spiderman);
       System.out.println("Programa Terminado!!");
    
    // Instanciar Objetos con Constructores
    Peliculac otrap = new Peliculac("Batman",2022);
    
    otrap.mostrardatos();
    
    
    }

 
}
    
    
   
