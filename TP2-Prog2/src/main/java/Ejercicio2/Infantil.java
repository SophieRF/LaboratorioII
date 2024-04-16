package Ejercicio2;
public class Infantil extends Libro{
    private String edadEstimada;

    public Infantil(String titulo, String autor, int anioDePublicacion, boolean esPrestado, String edadEstimada) {
        super(titulo, autor, anioDePublicacion, esPrestado);
        this.edadEstimada = edadEstimada;
    }

    public String getEdadEstimada() {
        return edadEstimada;
    }
    public void setEdadEstimada(String edadEstimada) {
        this.edadEstimada = edadEstimada;
    }
    @Override
    public String toString() {
        return "Titulo: "+ getTitulo() + "\nAutor: "+ getAutor() + "\nAño de publicación: " + getAnioDePublicacion() + "\nEdad estimada: "+ edadEstimada;
    }
    @Override
    public void prestar() {
        setEsPrestado(true);
        System.out.println("El libro "+ getTitulo() + " fue prestado");
    }

    @Override
    public void devolver() {
        setEsPrestado(false);
        System.out.println("El libro "+ getTitulo() + " fue devuelto a la biblioteca");
    }
}
