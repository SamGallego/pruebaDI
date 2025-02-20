package com.example.repaso.model;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    private int id;
    private String nombre;
    private String palabra;
    private boolean acierto;

    public Palabra(int id, String nombre, String palabra, boolean acierto) {
        this.id = id;
        this.nombre = nombre;
        this.palabra = palabra;
        this.acierto = acierto;
    }

    public Palabra(String nombre, String palabra) {
        this.nombre = nombre;
        this.palabra = palabra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    private static List<String> listaPalabras = new ArrayList<>();


    public static void inicializarLista() {
        listaPalabras.add(new String("Sol"));
        listaPalabras.add(new String("Montaña"));
        listaPalabras.add(new String("Espejo"));
        listaPalabras.add(new String("Relámpago"));
        listaPalabras.add(new String("Murmullo"));
        listaPalabras.add(new String("Sombrío"));
        listaPalabras.add(new String("Brisa"));
        listaPalabras.add(new String("Reloj"));
        listaPalabras.add(new String("Susurro"));
        listaPalabras.add(new String("Eclipse"));
        listaPalabras.add(new String("Destello"));
        listaPalabras.add(new String("Cascada"));
        listaPalabras.add(new String("Luz"));
        listaPalabras.add(new String("Mariposa"));
        listaPalabras.add(new String("Caminante"));
        listaPalabras.add(new String("Bosque"));
        listaPalabras.add(new String("Neblina"));
        listaPalabras.add(new String("Sombra"));
        listaPalabras.add(new String("Río"));
        listaPalabras.add(new String("Aurora"));
    }

    public static boolean existePalabra(String palabra) {
        for (String p : listaPalabras) {
            if (p.equalsIgnoreCase(palabra)) {
                return true;
            }
        }
        return false;
    }


}
