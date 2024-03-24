package TPRelacionesPte1;

public class Reserva {
    private int numeroReserva;
    private Vuelo vuelo;
    public Reserva(int numeroReserva, Vuelo vuelo){
        this.numeroReserva = numeroReserva;
        this.vuelo = vuelo;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }
    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void reservarVuelo(){
        System.out.println("Vuelo "+vuelo.getNumeroVuelo()+" reservado.\nNúmero de reserva: "+ getNumeroReserva());
    }
}
