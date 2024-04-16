package Ejercicio1;
public class Ave extends Animal {
    private String especie;
    private boolean habla;

    public Ave(String nombre, int edad, String tipoAnimal, double precio, String especie, boolean habla) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isHabla() {
        return habla;
    }
    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    @Override
    public void alimentar(String nombre){
        System.out.println("Alimentando al ave "+ nombre);
    }
    @Override
    public String toString() {
        return "Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nTipo de animal: "+ getTipoAnimal() + "\nPrecio: "+ getPrecio()+ "\nEspecie: "+ especie;
    }
}
