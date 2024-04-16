package Ejercicio1;
public class Gato extends Animal{
    private String raza;
    private boolean esterilizado;

    public Gato(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean esterilizado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }
    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
    @Override
    public void alimentar(String nombre){
        System.out.println("Alimentando al gato "+ nombre);
    }
    @Override
    public String toString() {
        return "Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nTipo de animal: "+ getTipoAnimal() + "\nPrecio: "+ getPrecio()+ "\nRaza: "+ raza;
    }
}
