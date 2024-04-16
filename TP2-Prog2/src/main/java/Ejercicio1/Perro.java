package Ejercicio1;
public class Perro extends Animal{
    private String raza;
    private boolean vacunado;
    public Perro(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean vacunado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }
    @Override
    public void alimentar(String nombre){
        System.out.println("Alimentando al perro "+ nombre);
    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nTipo de animal: "+ getTipoAnimal() + "\nPrecio: "+ getPrecio()+ "\nRaza: "+ raza;
    }
}
