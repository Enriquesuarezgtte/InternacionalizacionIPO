/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import Excepciones.CamposInvalidos;
import Excepciones.CamposVaciosException;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

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
                    canciones.add(musica);
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

    public void actualizarMusica(String nombre, String cantante, String album, String fecha, String id) throws CamposInvalidos, CamposVaciosException {
        if (!nombre.equals("") && !cantante.equals("") && !album.equals("") && !fecha.equals("")) {
      canciones.get(Integer.parseInt(id)).setNombre(nombre);
      canciones.get(Integer.parseInt(id)).setCantante(cantante);
      canciones.get(Integer.parseInt(id)).setAlbum(album);
      canciones.get(Integer.parseInt(id)).setFecha(fecha);
        }else {
            throw new CamposVaciosException();
        }
    }

    

    public ArrayList<String> buscarNombre(String eleccion) throws CamposInvalidos {
        System.out.println(eleccion);
        //Realizar el split con : y .
        try{
        String[] datos= eleccion.split(". ");
        
                String subs="";
                boolean flag=false;
              ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < datos.length; i++) {
            System.out.println("");
            for (int j = 0; j < datos[i].length(); j++) {
                System.out.print(datos[i].charAt(j));
            if(i%2!=0){
               subs+=datos[i].charAt(j)+"";                              
           }
              
                                     
        }  arr.add(subs);
               subs="";              
            }
        System.out.println("asd"+arr);
        ArrayList<String> arr1= new ArrayList();
        for (int i = 0; i < canciones.size(); i++) {
            if((canciones.get(i).getNombre()).equalsIgnoreCase(arr.get(1))&&(
                 canciones.get(i).getCantante()).equalsIgnoreCase(arr.get(3)) ){
            arr1.add(canciones.get(i).getNombre());
            arr1.add(canciones.get(i).getCantante());
            arr1.add(canciones.get(i).getAlbum());
            arr1.add(canciones.get(i).getFecha());         
            arr1.add(i+"");
            System.out.println("ppp"+arr1);
            }
             }
        return arr1;
        }catch(NullPointerException ex){
            throw new CamposInvalidos();
        }
    }

    public void eliminarMusica(String id) {
        canciones.remove(Integer.parseInt(id));
    }

}
