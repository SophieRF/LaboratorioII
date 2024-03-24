package TPRelacionesPte2;
import java.util.ArrayList;
import java.util.List;
public class Vuelo2 {
    private int codigoVuelo;
    private String destino;
    private String origen;
    private String fecha;
    private List<Cliente> clientes;
    public Vuelo2(int codigoVuelo, String destino, String origen, String fecha, Cliente cliente) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.clientes = new ArrayList<>();
        this.clientes.add(cliente);
    }
    public Vuelo2(int codigoVuelo, String destino, String origen, String fecha){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.clientes = new ArrayList<>();
    }
    public int getCodigoVuelo() {
        return codigoVuelo;
    }
    public void setCodigoVuelo(int codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void verTripulantes(){
        System.out.println("Tripulantes del vuelo "+getCodigoVuelo()+":");
        for (Cliente cliente : clientes) {
            System.out.println("ID Cliente: " + cliente.getIdCliente());
            System.out.println("Nombre Cliente: " + cliente.getNombre());
            System.out.println("-----------");
        }
    }
    public void detallesDeVuelo(){
        System.out.println("Código del vuelo: "+codigoVuelo);
        System.out.println("Destino: "+ destino);
        System.out.println("Origen: "+origen);
        System.out.println("Fecha de salida: "+fecha);
    }
}
