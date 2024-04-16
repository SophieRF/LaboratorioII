package Ejercicio2;
public class Universitario extends Libro{
    private String materiaAsociada;

    public Universitario(String titulo, String autor, int anioDePublicacion, boolean esPrestado, String materiaAsociada) {
        super(titulo, autor, anioDePublicacion, esPrestado);
        this.materiaAsociada = materiaAsociada;
    }

    public String getMateriaAsociada() {
        return materiaAsociada;
    }
    public void setMateriaAsociada(String materiaAsociada) {
        this.materiaAsociada = materiaAsociada;
    }
    @Override
    public String toString() {
        return "Titulo: "+ getTitulo() + "\nAutor: "+ getAutor() + "\nAño de publicación: " + getAnioDePublicacion() + "\nMateria asociada: "+ materiaAsociada;
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
