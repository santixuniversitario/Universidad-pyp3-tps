/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videoclubclass.videoclub;

/**
 *
 * @author Santiago Z
 */
public class Pelicula {
    private String titulo;
    private Integer anioEstreno;
    
    
    
    private categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pelicula{ " + "titulo= " + titulo + ", anioEstreno= " + anioEstreno + ", categoria= "+categoria.getNombre()+'}';
    }
    
    
    
}