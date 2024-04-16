package Ejercicio2;
public class Novela extends Libro{
    private String genero;
    public Novela(String titulo, String autor, int anioDePublicacion, boolean esPrestado, String genero) {
        super(titulo, autor, anioDePublicacion, esPrestado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Titulo: "+ getTitulo() + "\nAutor: "+ getAutor() + "\nAño de publicación: " + getAnioDePublicacion() + "\nGénero: "+ genero;
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
