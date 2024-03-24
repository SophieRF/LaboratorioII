package TPRelacionesPte2;
public class Cliente{
    private int idCliente;
    private String nombre;
    private Reserva2 reserva;

    public Cliente(int idCliente, String nombre, Reserva2 reserva) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reserva = reserva;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reserva2 getReserva() {
        return reserva;
    }
    public void setReserva(Reserva2 reserva) {
        this.reserva = reserva;
    }

    public void verReserva(){
        System.out.println("Su código de reserva es: "+ reserva.getCodigoReserva());
    }
}
