package Ejercicio1;
public class Pez extends Animal{
    private String habitat;

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String habitat) {
        super(nombre, edad, tipoAnimal, precio);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public void alimentar(String nombre){
        System.out.println("Alimentando al pez "+ nombre);
    }
    @Override
    public String toString() {
        return "Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nTipo de animal: "+ getTipoAnimal() + "\nPrecio: "+ getPrecio()+ "\nHábitat: "+ habitat;
    }
}
