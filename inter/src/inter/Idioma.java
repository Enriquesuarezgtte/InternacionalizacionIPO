/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.util.ArrayList;

/**
 *
 * @author macosx
 */
class Idioma {

    String nombre;

    ArrayList<String> texto;
    ArrayList<String> imagenes;

    public Idioma() {
        texto = new ArrayList<>();
        imagenes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getTexto() {
        return texto;
    }

    public void setTexto(ArrayList<String> texto) {
        this.texto = texto;
    }

    public ArrayList<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public String toString() {
        return "Idioma{" + "nombre=" + nombre + ", texto=" + texto + ", imagenes=" + imagenes + '}';
    }

}
