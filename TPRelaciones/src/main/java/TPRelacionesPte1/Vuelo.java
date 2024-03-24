package TPRelacionesPte1;
public class Vuelo {
    private int numeroVuelo;
    public Vuelo(int numeroVuelo){
        this.numeroVuelo = numeroVuelo;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void establecerVuelo(Avion avion){
        System.out.println("Vuelo establecido para el avión de matrícula "+ avion.getMatricula());
    }
}

