/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import Excepciones.CamposInvalidos;
import Excepciones.CamposVaciosException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macosx
 */
public class Inter {

    /**
     * @param args the command line arguments
     */
    File archivo;
    FileReader fr = null;
    BufferedReader bf = null;
    TreeMap<String, Idioma> tr = null;
    ArrayList<String> nombreIdiomas = null;
    ArrayList<Musica> canciones = null;
    int contadorTexto;
    int contadorImagenes;
    String idiomaActual;
    Musica musica = null;

    public Inter() throws Exception {
        archivo = new File("./idiomas/idiomas.txt");
        try {
            fr = new FileReader(archivo);
            bf = new BufferedReader(fr);
            tr = new TreeMap<>();
            nombreIdiomas = new ArrayList<>();
            canciones = new ArrayList<>();
            String idiomaActual = "es";
            iniciar();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }

            } catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }

    }

    public String obtenerLinea(String idioma, int numero) {
        String linea = "";
        linea = tr.get(idioma).getTexto().get(numero);
        return linea;
    }

    public void iniciar() throws IOException {
        // TODO code application logic here

        int idioma = Integer.parseInt(bf.readLine());
        for (int i = 0; i < idioma; i++) {
            Idioma id = new Idioma();

            id.setNombre(bf.readLine());

            contadorTexto = Integer.parseInt(bf.readLine());
            for (int j = 0; j < contadorTexto; j++) {
                id.texto.add(bf.readLine());
            }
            contadorImagenes = Integer.parseInt(bf.readLine());
            for (int j = 0; j < contadorImagenes; j++) {
                id.imagenes.add(bf.readLine());
            }
            tr.put(id.getNombre(), id);
            nombreIdiomas.add(id.getNombre());
        }

        System.out.println(tr);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public ArrayList<Musica> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Musica> canciones) {
        this.canciones = canciones;
    }

    public String getIdiomaActual() {
        return idiomaActual;
    }

    public void setIdiomaActual(String idiomaActual) {
        this.idiomaActual = idiomaActual;
    }

    public BufferedReader getBf() {
        return bf;
    }

    public void setBf(BufferedReader bf) {
        this.bf = bf;
    }

    public TreeMap<String, Idioma> getTr() {
        return tr;
    }

    public void setTr(TreeMap<String, Idioma> tr) {
        this.tr = tr;
    }

    public int getContadorTexto() {
        return contadorTexto;
    }

    public void setContadorTexto(int contadorTexto) {
        this.contadorTexto = contadorTexto;
    }

    public int getContadorImagenes() {
        return contadorImagenes;
    }

    public void setContadorImagenes(int contadorImagenes) {
        this.contadorImagenes = contadorImagenes;
    }

    public void colocarTexto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<String> getNombreIdiomas() {
        return nombreIdiomas;
    }

    public void setNombreIdiomas(ArrayList<String> nombreIdiomas) {
        this.nombreIdiomas = nombreIdiomas;
    }

    public void crearMusica(String nombre, String cantante, String album, String fecha) throws CamposVaciosException, CamposInvalidos {
        if (!nombre.equals("") && !cantante.equals("") && !album.equals("") && !fecha.equals("")) {
            LocalDate ld = LocalDate.now();

            try {
                Integer anio = Integer.parseInt(fecha);
                if (ld.getYear() >= Integer.parseInt(fecha)) {
                    Musica musica = new Musica(cantante, nombre, fecha, album);
                } else {
                    throw new CamposInvalidos();
                }
            } catch (NumberFormatException exc) {
                throw new CamposInvalidos();
            }
        } else {
            throw new CamposVaciosException();
        }

    }

}
