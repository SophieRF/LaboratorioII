package Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca bibliotecaDeMza = new Biblioteca();
        bibliotecaDeMza.setLibros(new ArrayList<>());

        bibliotecaDeMza.agregarLibro(new Infantil("La niña invisible", "María Luisa Gefaell",1953,false,"+5"));
        bibliotecaDeMza.agregarLibro(new Novela("La casa de los espíritus","Isabel Allende", 1982,true, "Realismo mágico"));
        bibliotecaDeMza.agregarLibro(new Universitario("Neurociencia Cognitiva: La Biología de la Mente", "Marie T. Banich, Rebecca J. Compton", 2017, false, "Medicina"));

        bibliotecaDeMza.prestarLibro(bibliotecaDeMza.getLibros().get(bibliotecaDeMza.buscarLibro("Neurociencia Cognitiva: La Biología de la Mente")));
        bibliotecaDeMza.devolverLibro(bibliotecaDeMza.getLibros().get(bibliotecaDeMza.buscarLibro("La casa de los espíritus")));
        bibliotecaDeMza.mostrarLibros();
    }
}
