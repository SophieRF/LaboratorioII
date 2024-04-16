package Ejercicio1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaDeMascotas = new TiendaMascotas();
        tiendaDeMascotas.setAnimales(new ArrayList<>());

        tiendaDeMascotas.addAnimal(new Perro("Tommy", 1, "Perro",20.5,"Boxer",true));
        tiendaDeMascotas.addAnimal(new Gato("Luna", 2, "Gato", 15, "Persa",true));
        tiendaDeMascotas.addAnimal(new Ave("Coco", 1, "Ave", 12.3, "Loro",true));
        tiendaDeMascotas.addAnimal(new Pez("Golden", 2, "Pez", 4.5, "Agua dulce"));
        
        System.out.println(tiendaDeMascotas.getAnimales().get(tiendaDeMascotas.buscarAnimal("Tommy")).toString());

        tiendaDeMascotas.listarAnimales();
        tiendaDeMascotas.alimentarAnimal("Luna");
        tiendaDeMascotas.venderAnimal("Coco");
        tiendaDeMascotas.listarAnimales();
    }
}
