package Ejercicio2;
public abstract class Libro implements Prestable{
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private boolean esPrestado;

    public Libro(String titulo, String autor, int anioDePublicacion, boolean esPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
        this.esPrestado = esPrestado;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }
    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public boolean EsPrestado() {
        return esPrestado;
    }
    public void setEsPrestado(boolean esPrestado) {
        this.esPrestado = esPrestado;
    }

    @Override
    public String toString() {
        return "Titulo: "+ titulo + "\nAutor: "+ autor + "\nAño de publicación: " + anioDePublicacion;
    }

    @Override
    public void prestar() {
        esPrestado = true;
    }

    @Override
    public void devolver() {
        esPrestado = false;
    }
}
