package Ejercicio2;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
    }
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void mostrarLibros(){
        System.out.println("Libros:");
        for (Libro libro: libros){
            System.out.println(libro.toString());
        }
    }
    public int buscarLibro(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                return i;
            }
        }
        return -1;
    }
    public void prestarLibro(Libro libro){
        libro.prestar();
    }
    public void devolverLibro(Libro libro){
        libro.devolver();
    }
}
