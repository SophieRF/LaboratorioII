package TPRelacionesPte2;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(01,"Ana Martínez",new Reserva2(10));
        Cliente cliente2 = new Cliente(02,"Pedro Sanchez", new Reserva2(11));
        cliente1.verReserva();
        Vuelo2 vuelo1 = new Vuelo2(1021,"Barcelona-España","Mendoza-Argentina", "22/03/2024",cliente1);
        vuelo1.detallesDeVuelo();
        vuelo1.agregarCliente(cliente2);
        vuelo1.verTripulantes();
        cliente1.verReserva();
    }
}
