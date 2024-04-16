package Ejercicio1;
import java.util.ArrayList;
public class TiendaMascotas {
    private ArrayList<Animal> animales;

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public TiendaMascotas(){
    }
    public TiendaMascotas(ArrayList<Animal> animales) {
        this.animales = animales;
    }
    public void addAnimal(Animal animal){
        animales.add(animal);
    }
    public void venderAnimal(String nombre){
        animales.remove(animales.get(buscarAnimal(nombre)));
        System.out.println("Se vendió " + nombre);
    }
    public void alimentarAnimal(String nombre){
        System.out.println("Alimentando a "+ nombre);
    }
    public void listarAnimales(){
        System.out.println("Animales de la tienda: ");
        for (Animal animal: animales){
            System.out.println(animal);
        }
    }
    public int buscarAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}
