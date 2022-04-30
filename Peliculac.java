/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoclubclass.videoclub;

class Peliculac {
    public String titulo;
    public Integer anioEstreno;
    
    //iniciar constructor
    public Peliculac (String _titulo, Integer _Anio){
        titulo = _titulo;
        anioEstreno = _Anio;
    }
    
    // Metodo para mostrar 
    public void mostrardatos(){
        System.out.println("El nombre de la pelicula es: "+titulo);
        System.out.println("El año de lanzamiento fue: "+anioEstreno);
 
    }
    
}
